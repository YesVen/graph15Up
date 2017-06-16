package sweat.like.a.pro.beforejava7.riddles.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 */

class Producer implements Runnable
{
	private final List<Integer> queue; 
	private final int MAX_SIZE = 5;
	
	public Producer(List<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() 
	{
		int counter = 0;
		while(true)
		{
			try {
				produce(counter++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void produce(int counter) throws InterruptedException
	{
		synchronized (queue) {
			while(queue.size() == MAX_SIZE)
			{
				System.out.println("Producer waiting as capacity full");
					queue.wait();
			}
			
			Thread.sleep(1000);
			queue.add(counter);
			System.out.println("Producer Produced "+ counter);
			
			queue.notifyAll();
		}
	}
}



class Consumer implements Runnable
{
	private final List<Integer> queue; 
	
	public Consumer(List<Integer> queue) 
	{
		this.queue = queue;
	}
	
	@Override
	public void run() {
		synchronized (queue) {
			
			while(true)
			{
				try {
					consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void consume() throws InterruptedException {
		while(queue.isEmpty())
		{
			System.out.println("Consumer waiting as nothing to consume");
			queue.wait();
		}
		
		System.out.println("Consuming element"+ queue.get(0));
		queue.remove(0);
		
		queue.notifyAll();
	}
	
	
	
}

public class WaitNotifyExample {
	
	
	public static void main(String[] args) {
		List<Integer>queue = new ArrayList<Integer>();
		Thread producer = new Thread(new Producer(queue),"producer");
		Thread consumer = new Thread(new Consumer(queue),"consumer");
		
		producer.start();
		consumer.start();
		
		
		
	}
}

