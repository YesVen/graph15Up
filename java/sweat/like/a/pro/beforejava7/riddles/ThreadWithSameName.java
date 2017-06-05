package sweat.like.a.pro.beforejava7.riddles;

/**
 *	Threads are distinguished based on thread ID and not names.
 *	So duplicate names are allowed.
 *
 *  Use getId() method to get ID of the thread
 * 
 *
 */
public class ThreadWithSameName {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread t1 = new Thread(() -> {	
			System.out.println("t1 name is " + Thread.currentThread().getName());
			System.out.println("t1 id is " + Thread.currentThread().getId());
			System.out.println("t1 priority is " + Thread.currentThread().getPriority());
			System.out.println("t1 state inside run is " + Thread.currentThread().getState());
		}, "main");
		System.out.println("t1 state is " + t1.getState());
		t1.start();
		
		Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "main");
		
		t2.start();
	}
}
