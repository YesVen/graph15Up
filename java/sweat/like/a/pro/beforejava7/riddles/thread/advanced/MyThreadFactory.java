package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ThreadFactory reduces extra wiring required for creating threads and makes programmers life simple
 * It creates threads on demand.
 * 
 * e.g if you want few threads which does same task, then rathen than creatig them independantly, its better to
 * declare behavior in one shot inside threadfactory.
 * Here I want 5 threads which prints numbers 1 to 10. 
 */
public class MyThreadFactory implements ThreadFactory
{
	private Thread t;
	private int i = 0;
	ReentrantLock l = new ReentrantLock();	
	@Override
	public Thread newThread(Runnable r) {
		
		t = new Thread(() -> {
			l.lock();
			for (int i = 0; i < 10; i++) {  
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread"+ Thread.currentThread().getName()+ " printed " + i);
			}
			l.unlock();
		}, Integer.toString(i++));
		return t;
	}
	
	
	public static void main(String[] args) {
		MyThreadFactory factory = new MyThreadFactory();
		Thread t1 = factory.newThread(null);
		Thread t2 = factory.newThread(null);
		Thread t3 = factory.newThread(null);
		Thread t4 = factory.newThread(null);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
