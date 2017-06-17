package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample1 {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t2 = new MyThread(d, "Yuvraj");
		MyThread t1 = new MyThread(d, "Dhoni");
		
		t1.start();
		t2.start();
	}
}


class Display {
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
		try {
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Good Morning " + name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} 
		finally
		{
			lock.unlock();
		}
	}
}


class MyThread extends Thread
{
	Display d;
	String name;
	public MyThread(Display d, String name )
	{
		this.name = name;
		this.d = d;
	}
	
	@Override
	public void run() {
		d.wish(this.name);
	}
}