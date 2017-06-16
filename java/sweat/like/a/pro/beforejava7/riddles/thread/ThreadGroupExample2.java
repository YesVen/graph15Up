package sweat.like.a.pro.beforejava7.riddles.thread;


/**
 * Thread group can be set as daemon.
 * 
 * enumerate : This method copies every thread in current threadgroup and its subgroups recursively
 *  into an array
 *
 */
public class ThreadGroupExample2 {
	public static void main(String[] args) {
	
		System.out.println("Current Thread group is "+ Thread.currentThread().getThreadGroup());
		
		ThreadGroup g1 = new ThreadGroup("g1");
		
		
		ThreadGroup g1_1 = new ThreadGroup(g1,"g1.1");
		ThreadGroup g1_2 = new ThreadGroup(g1,"g1.2");
		Thread t1 = new Thread(g1,"1st Thread in g1");
		
		//adding threads in g1.1
		Thread t2 = new Thread(g1_1,"1st Thread in g1.1");
		Thread t3 = new Thread(g1_1,"1st Thread in g1.1");

		//adding threads in g1.2
		Thread t4 = new Thread(g1_2,"1st Thread in g1.2");
		Thread t5 = new Thread(g1_2,"1st Thread in g1.2");
		
		ThreadGroup systemThreadgroup = g1.getParent().getParent();
		
		//Print all thread information to console
		systemThreadgroup.list();
		
		
		Thread[] list = new Thread[g1.getParent().getParent().activeCount()];
		
		systemThreadgroup.enumerate(list);
		
		System.out.println(list.length);
		
		for(Thread t : list)
		{
			System.out.println(t.getName());
		}
		
	}
}
