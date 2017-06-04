package sweat.like.a.pro.beforejava7.riddles.thread;

class MyThread extends Thread
{
	@Override
	public void run() {
		System.out.println("Still Executing mail thread. U need to call start() method on t1 not run()");
	}
}

public class ThreadExample1 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		System.out.println("Executing main thread");
		
		//caling run will not start thread. It will be just like normal method call
		t1.run();
		
		//Correct way of execution
		t1.start();
	}
}
