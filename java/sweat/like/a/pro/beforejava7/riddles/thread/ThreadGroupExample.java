package sweat.like.a.pro.beforejava7.riddles.thread;

import sun.rmi.runtime.NewThreadAction;

public class ThreadGroupExample {
	public static void main(String[] args) {
		
		System.out.println("Currently Running Thread is "+  Thread.currentThread().getName() 
				+ " and its thread group is " +  Thread.currentThread().getThreadGroup().getName());
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		
		/*
		 * Estimate of number of active thread in this group and subgroups
		 */
		System.out.println("Active Threads are "+ mainGroup.activeCount());
		
		System.out.println("Number of active groups are " +mainGroup.activeGroupCount());
		
		ThreadGroup subGroup1 = new ThreadGroup(mainGroup, "childgroup1");
		Thread t1 = new Thread(subGroup1,() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		},"childThread1");
		
		t1.start();
		
		System.out.println("Active Threads are "+ mainGroup.activeCount());
		
		System.out.println("Number of active groups are " +mainGroup.activeGroupCount());
		
		/*
		 * We create threadgroup with name "system" even though system is root of all threadgroups
		 */
		ThreadGroup subGroup2 = new ThreadGroup(mainGroup, "system");
		subGroup2.setDaemon(true);
		
		System.out.println(mainGroup.parentOf(subGroup1));
		
		System.out.println("parent of main threadgroup is " + mainGroup.getParent());
		
		System.out.println("Parent of system thread is " + mainGroup.getParent().getParent()+ " means that system is god threadgroup in java");
		
		/*
		 * Lists all threads in the group in hierarchical manner
		 */
		mainGroup.list();
		
		/*
		 * Max priority of the thread cannot be greater than max priority of the threadgroup.
		 * It wont throw any exception but it will automatically adjust it to parent threadgroup's max priority
		 */
		System.out.println(" Main group max priority is "+mainGroup.getMaxPriority() +" \n child group max priority is "+ subGroup1.getMaxPriority() 
				+ "\n t1 priority is "+t1.getPriority() + "because parent thread is main and main has priority 5");
		
		subGroup2.setMaxPriority(151);
		
		System.out.println(subGroup2.getMaxPriority());
		
	}
}
