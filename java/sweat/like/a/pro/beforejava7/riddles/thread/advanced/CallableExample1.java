package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 * Similar to runnable except
 * 		1.	It returns some value in form of Future Object
 * 		2. 	Can throw checked exception
 * 
 * Below program creates few threads. Each thread returns some result. 
 * Sum of all result returned by all threads is printedS
 */
public class CallableExample1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		MyCallable[] jobs = {
				new MyCallable(10),
				new MyCallable(5),
				new MyCallable(4),
				new MyCallable(120),
				new MyCallable(110),
				new MyCallable(102),
				new MyCallable(220),
				new MyCallable(232),
				new MyCallable(10),
				new MyCallable(12),
				new MyCallable(23),
		};
		
		int totalSum = 0;
		
		for(MyCallable job : jobs)
		{
			Future<Integer> result = service.submit(job);
			System.out.print(result.get() + "\n");
			totalSum += result.get();
		}
		
		System.out.println("\n\n\ngrand sum is " + totalSum);
		service.shutdown();
	}
}

class MyCallable implements Callable<Integer>
{
	private int sum = 0;
	private int number;
	
	public MyCallable(int number) {
		this.number = number;
	}
	
	@Override
	public Integer call() throws Exception 
	{
		System.out.print(Thread.currentThread().getName() + 
				" is responsible for calling sum of first " +
				number + " numbers = ");
		for (int i = 1; i <= number ; i++) {
			sum+= i;
		}
		return sum;
	}
	
}