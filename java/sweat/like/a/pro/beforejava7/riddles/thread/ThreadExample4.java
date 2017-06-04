package sweat.like.a.pro.beforejava7.riddles.thread;

class MyThread1 extends Thread
{
	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}

public class ThreadExample4 {
	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		System.out.println("Executing main thread");
		
		Thread t2 = new Thread(t1);//Valid way to pass Runnable
		
		t1.start();
		t2.start();
	}
}
