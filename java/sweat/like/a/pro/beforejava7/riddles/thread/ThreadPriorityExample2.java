package sweat.like.a.pro.beforejava7.riddles.thread;

/**
 *	Threads have priority between 1 -10
 *	Attempt to set it above 10 will give IllegalArgumentException 
 * 
 *	Main thread priority is 5.
 *
 *	Child thread priority  = parent thread priority
 */
public class ThreadPriorityExample2 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			System.out.println("Printing child numbers");
			for(int i =0; i<10; i++)
			{
				System.out.print(i + " ");
			}
		});
		/*
		 * UnComment below line and run program. See output
		 * Comment below line and run program. See output
		 */
		//t1.setPriority(1);
		
		t1.start();
		
		for(int i =0; i<10; i++)
		{
			System.out.print(i + "-main  ");
		}
		
		
	}
}
