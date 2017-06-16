package sweat.like.a.pro.beforejava7.riddles.thread;

public class ThreadGroupExample1 {
	public static void main(String[] args) {
		ThreadGroup tg1  = new ThreadGroup("tg1");
		System.out.println("Default max priority of new threadgroup is " + tg1.getMaxPriority());
		
		tg1.setMaxPriority(7);
		
		Thread t1 = new Thread(tg1, "t1");
		System.out.println("Default priority of new thread is "+ t1.getPriority());//5
		
		Thread t2 = new Thread(tg1, "t2");
		// This will not set priority to 10 as thread group priority is set to max 7
		t2.setPriority(10);
		System.out.println(t2.getPriority());//7
		
		
		
		
	}
}
