package sweat.like.a.pro.beforejava7.riddles.thread;

/**
 * If we start a thread once again, bramha will throw IllegalThreadStateException
 *
 */

class MyThread extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("Start");
	}
	
	
	
	
	@Override
	public void run() {
		System.out.println("Still Executing mail thread. U need to call start() method on t1 not run()");
	}
}

public class ThreadExample1 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		System.out.println("Executing main thread");
		
		//calling run will not start thread. It will be just like normal method call
		t1.run();
		
		//Correct way of execution
		t1.start();
		t1.start();
	}
}
