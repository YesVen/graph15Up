package sweat.like.a.pro.singleton.breaking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Use synchronized method for getInstance
 * This is okay but in  a system where a singleton is a fairly complex object, it required a time to create singleton.
 * It may be possible that by the time singleton is getting created, other threads require singleton instance, so they have to wait.
 * 
 * This leads us to use synchronized at more granular level, inside method
 * 
 */
public class BreakUsingThreadsSolution3 {
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(() -> {
			Singleton8 soleInstance2 = Singleton8.getSoleInstance();
			System.out.println("hashcode : "+soleInstance2.hashCode());
		});
		
		service.submit(() -> {
			Singleton8 soleInstance3 = Singleton8.getSoleInstance();
			System.out.println("hashcode : "+soleInstance3.hashCode());
		});
		
		System.out.println("Two diffrent hashcodes means two instances ");
		service.shutdown();
	}
}

class Singleton8 
{
	private static volatile Singleton8 soleInstance;

	private Singleton8() {
		
	}

	public static Singleton8 getSoleInstance(){
		/*
		 * Here we made singleton instance volatile.
		 * This is required because, there might be a case where multiple threads are operating and both of them calls  getSoleInstance
		 * simultaneously.
		 * There might be a chance that a thread 1 creates half constructed object. Java allows memory to expose such half object to world.
		 * Thread 2 sees this half object and starts using it. Thread 2 will now fail.
		 * 
		 * volatile make sure this doesnt happen
		 *  
		 */
		if(soleInstance == null){
			synchronized (Singleton8.class) {
				if(soleInstance == null){
					soleInstance = new Singleton8();
				}
			}
		}
		return soleInstance;
	}
}