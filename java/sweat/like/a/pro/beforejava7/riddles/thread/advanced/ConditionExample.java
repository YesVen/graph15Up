package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Execute thread 1 half then wait for thread 2 to get complete and then execute remaining part of thread 1
 *
 */
public class ConditionExample {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		Wisher w = new Wisher();
		Thread t1 = new MyThread2(w);
		t1.setName("t1");
		Thread t2 = new MyThread2(w);
		t2.setName("t2");
		t1.start();
		
		t2.start();
	}
}


class Wisher
{
	final ReentrantLock lock = new ReentrantLock();
	Condition halfExecution = lock.newCondition();
	public void wish() throws InterruptedException
	{
		lock.lock();
		
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello There from " + Thread.currentThread().getName());
				if(Thread.currentThread().getName().equals("t1") && i == 5)
				{
					halfExecution.await();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(Thread.currentThread().getName().equals("t2"))
			{
				halfExecution.signal();
			}
		} finally{
			lock.unlock();
		}
	}
}

class MyThread2 extends Thread
{
	Wisher w;
	
	public MyThread2(Wisher w) {
		this.w = w;
	}
	
	@Override
	public void run() {
		try {
			this.w.wish();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}