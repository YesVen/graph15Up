package sweat.like.a.pro.beforejava7.riddles.thread;

class MyThread2 extends Thread
{
	
	
}

public class ThreadExample5 {
	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2();
		System.out.println("Executing main thread");
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Dnyanesh");// Main Thread name is changed
		
		MyThread2 m = new MyThread2();
		//If not set by programmer, JVM internally set name
		System.out.println(m.getName());
		
		//Now see the exception thread name in console
		System.out.println(10/0);
		
		//Exception in thread "Dnyanesh" java.lang.ArithmeticException: / by zero
 
		
	}
}
