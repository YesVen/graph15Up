package sweat.like.a.pro.beforejava7.riddles.thread;

/**
 *	Threads have priority between 1 to 10
 *	Attempt to set it above 10 will give IllegalArgumentException 
 * 
 *	Main thread priority is 5.
 *
 *	Child thread priority  = parent thread priority
 */
public class ThreadPriorityExample {
	public static void main(String[] args) {
		
		System.out.println("Main Thread Priority is "+ Thread.currentThread().getPriority());
		
		Thread t1 = new Thread(() -> {
			System.out.println("IN Child Thread " + Thread.currentThread().getName());
			});
		t1.setName("Dnyanesh");
		System.out.println("t1 prioroty is " + t1.getPriority() + 
				" because its parent thread is "+ Thread.currentThread().getName() 
				+ " whose prioroty is "+  Thread.currentThread().getPriority());
		
		t1.setPriority(2);
		
		
		Thread t2 = new Thread(() -> System.out.println("IN Child Thread  " + Thread.currentThread().getName() ), "Ashu");
		
		t2.setPriority(1);
		
	
		/*
		 * Even though we set priority for threads.
		 * 
		 * Its JVMs call to run which thread.  Its just a request to JVM.
		 * It is not mandatory that JVM will obey your request 
		 * 
		 */
		t1.start();
		t2.start();
		
		/*
		 * Not we can set Max priority to thread group but not to thread
		 * Threads inherits the priority from thread its group.
		 * 
		 * 
		 * subGroup2.setMaxPriority(151);
		 * Above statement will not have any impact. Changing max priority out of bounds will not have any effect  
		 * See setMaxPriority implementation 
		 */
		t1.setPriority(100);// This will throw IllegalArgumentException
	}
}
