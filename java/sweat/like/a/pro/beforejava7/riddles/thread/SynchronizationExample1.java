package sweat.like.a.pro.beforejava7.riddles.thread;

public class SynchronizationExample1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> printNumbers());
		Thread t2 = new Thread(() -> printNumbers());
		Thread t3 = new Thread(() -> printNumbers());
		
		//Here we will get regular output because static method require class level lock 
		//which can be given to one thread at a time
		t1.start();
		t2.start();
		t3.start();
		
		
		SynchronizationExample1 obj1 = new SynchronizationExample1();
		SynchronizationExample1 obj2 = new SynchronizationExample1();
		Thread t4 = new Thread(() -> obj1.sayHello());
		Thread t5 = new Thread(() -> obj2.sayHello());
		
		//Here we will get irregular output
		//Here synchronization will not be done as we are starting 2 threads on two different objects
		//Here object level lock is required
		t4.start();
		t5.start();
	}
	
	public static synchronized void printNumbers()
	{
		for(int i=0; i<10; i++)
		{
			System.out.print(i+ " ");
		}
	}
	
	/*
	 * even though we are making this method synchronized, two different objects obj1 and obj2 are used.
	 * So here, both threads are allowed to access at a time
	 */
	public synchronized void sayHello()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Hello " + i);
		}
	}
	
	
	
	
}
