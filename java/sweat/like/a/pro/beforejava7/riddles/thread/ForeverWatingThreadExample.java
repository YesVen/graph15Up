package sweat.like.a.pro.beforejava7.riddles.thread;

public class ForeverWatingThreadExample {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Started executing main thread");
		
		Child t1 = new Child();
		t1.setName("t1");
		
		t1.start();
		Thread.sleep(1000);
		synchronized (t1) {
			System.out.println("main thread calling wait method");

			/*
			 * This thread will wait untill it is get notified. In this case it will wait forever.
			 * Solution is to have waiting limited time
			 * t1.wait(5000)
			 */
			t1.wait();
			
			System.out.println("Main thread got notification");
			
			System.out.println(t1.result);
		}
		
		 
	}
}


class Child extends Thread
{
	int result = 0; 
	
	
	@Override
	public void run()
	{
		System.out.println("Entereing t1 thread");
		synchronized (this) 
		{
			for (int i = 1; i <= 100 ; i++) {
				result = result + i;
			}
			System.out.println("Calculation Done : Notifying main thread");
			this.notify();
		}
		
	}
}