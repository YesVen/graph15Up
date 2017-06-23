package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecuterExample1 {

	public static void main(String[] args) {
		/*
		 * Its not necessary to create poll of 3 threads a we have 3 threads to run
		 * We can have 100 threads to run but we can still create pool of 10 threads./
		 * Threads which get free early will be shedules for remaining task
		 * 
		 *   Same implementation is used in web containder.
		 */
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



