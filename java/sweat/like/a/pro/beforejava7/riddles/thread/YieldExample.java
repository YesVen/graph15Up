package sweat.like.a.pro.beforejava7.riddles.thread;

/*
 * A hint to the thread scheduler that the current thread is willing to yield its current use of a processor. 
 * The scheduler is free to ignore this hint.
 * 
 * It is rarely appropriate to use this method. It may be useful for debugging or testing purposes, 
 * where it may help to reproduce bugs due to race conditions
 */
public class YieldExample 
{
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
			Thread.yield();
			for (int i = 0; i < 10 ; i++) {
				System.out.println(i + " ");
			}
		}, "One");
		
		t1.start();
		
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println(i + " "+ Thread.currentThread().getName());
		}
		
	}
}
