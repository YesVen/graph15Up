package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample2 {
	public static void main(String[] args) {
		
		final Lock lock = new ReentrantLock();
		
		Thread t1 = new Thread(()-> {
				run(lock);
		}, "t1");
		
		Thread t2 = new Thread(()-> {
			run(lock);
		}, "t2");
		
		t1.start();
		t2.start();
	}

	private static void run(Lock lock) {
		do{
			if(lock.tryLock())
			{
				System.out.println(Thread.currentThread().getName() + " performing safe operation");
				lock.unlock();
				break;
			}
			else
			{
				System.out.println(Thread.currentThread().getName() + " performing alternative operation. Will try for getting lock too.");
			}
		}while(true);
	}
	
	
}
