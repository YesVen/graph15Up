package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample2 {
	public static void main(String[] args) throws InterruptedException {
		DisplayDemo d = new DisplayDemo();
		MyThread1 t2 = new MyThread1(d, "Yuvraj");
		MyThread1 t1 = new MyThread1(d, "Dhoni");
		
		t1.start();
		t2.start();
	}
}


class DisplayDemo {
	ReentrantLock lock = new ReentrantLock();
	public void wish(String name)
	{
		/*
		 * It is recommended that use code to run in synchronized fashion should be kept in
		 * try catch block. And use finally for unlocking this lock in case if this thread get interrupted.
		 * Else it will cause permanent starvation of other threads waiting for lock. If This thread dies abruptly
		 * there is no one to unlock the lock
		 */
		
		lock.lock();
			for (int i = 0; i < 10; i++) {
				System.out.println("Good Morning " + name);
				try {
					Thread.sleep(1000);
					/*
					 * Here i am throwing exception from thread 1. 
					 * Thread 1 has got no chance to release lock. So
					 * thread 2 will wait forever as there is no one to unlock the lock.
					 * So recomended to use finally block and release lock
					 */
					throw new RuntimeException();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		lock.unlock();
	}
}


class MyThread1 extends Thread
{
	DisplayDemo d;
	String name;
	public MyThread1(DisplayDemo d, String name )
	{
		this.name = name;
		this.d = d;
	}
	
	@Override
	public void run() {
		d.wish(this.name);
	}
}