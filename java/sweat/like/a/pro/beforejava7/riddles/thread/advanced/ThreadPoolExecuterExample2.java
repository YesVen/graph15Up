package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * Program Objective : 
 * 
 * Restart task one after completing.
 * 
 * If any task fails then restart the task
 *
 */
public class ThreadPoolExecuterExample2 {

	public static void main(String[] args) {
		ExecutorService executer = Executors.newFixedThreadPool(3);
		Future taskoneResult = null;
		Future tasktwoResult = null;
		Future taskthreeResult = null;
		
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
		
		while(true)
		{	
			if(taskoneResult == null || taskoneResult.isDone())
			{
				taskoneResult = executer.submit(taskone);
			}
		
		
			if(tasktwoResult == null)
			{
				tasktwoResult = executer.submit(tasktwo);
			}
			
			
			if(taskthreeResult ==null )
			{
				taskthreeResult = executer.submit(taskthree);
			}
			
		}
	}

}



