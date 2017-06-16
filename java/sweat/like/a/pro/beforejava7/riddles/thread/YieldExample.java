package sweat.like.a.pro.beforejava7.riddles.thread;

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
