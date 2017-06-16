package sweat.like.a.pro.beforejava7.riddles.thread;


/**
 *	Daemon thread dies as soon as its parent dies 
 *
 */
public class DaemonThreadExamplr {
	public static void main(String[] args) {
		
		
		/*
		 * This thread will not print for 10 times because
		 * 		Daemoon thread keep on working as long as there is any user thread/ nondaemon thread is running
		 * 		If all user threads dies then it dies automatically
		 * 
		 * Sole purpose of daemon thread is to serve user threads. 
		 */
		Thread daemonThread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("daemon Thread");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		daemonThread.setDaemon(true);
		
		
		
		daemonThread.start();
		
		
		
		System.out.println("End Of main thread");
		
		
	}
}
