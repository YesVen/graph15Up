package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecuterExample1 {

	public static void main(String[] args) {
		ExecutorService executer = Executors.newFixedThreadPool(3);
		
		Thread taskone = new Thread(() ->{
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println("taskone executing " + i);
					Thread.sleep(1000);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"taskone");
		
		
		Thread tasktwo = new Thread(() ->{
			System.out.println("tasktwo executing");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"tasktwo");
		
		Thread taskthree = new Thread(() ->{
			System.out.println("taskthree executing");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"taskthree");
		
		executer.submit(taskone);
		executer.submit(tasktwo);
		executer.submit(taskthree);
		
		System.out.println(executer.isShutdown());
		executer.shutdown();
		
		System.out.println(executer.isShutdown());
	}

}



