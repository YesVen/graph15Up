package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

/**
 * Creates an object local it current thread.
 * 
 * This object is only accessed by thread in which it is created
 *
 */
public class ThreadLocalExample2 {
	public static void main(String[] args) {
		
		System.out.println("Current Executing thread is " + Thread.currentThread().getName());
		
		CustomerThread cust1 = new CustomerThread("Customer Thread 1");
		CustomerThread cust2 = new CustomerThread("Customer Thread 2");
		CustomerThread cust3 = new CustomerThread("Customer Thread 3");
		CustomerThread cust4 = new CustomerThread("Customer Thread 4");
		CustomerThread cust5 = new CustomerThread("Customer Thread 5");
		
		cust1.start();
		cust2.start();
		cust3.start();
		cust4.start();
		cust5.start();
	}
}

class CustomerThread extends Thread
{
	private int customerId=0;
	
	public CustomerThread(String threadName) {
		super(threadName);
	}  
	
	ThreadLocal<Integer> local = new ThreadLocal<Integer>(){
		protected Integer initialValue() {
			return ++customerId;
		}
	};
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +
				" executing for customerId " + local.get());
	}
}
