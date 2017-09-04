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
public class BreakUsingThreadsSolution2 {
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(() -> {
			Singleton7 soleInstance2 = Singleton7.getSoleInstance();
			System.out.println("hashcode : "+soleInstance2.hashCode());
		});
		
		service.submit(() -> {
			Singleton7 soleInstance3 = Singleton7.getSoleInstance();
			System.out.println("hashcode : "+soleInstance3.hashCode());
		});
		
		System.out.println("Two diffrent hashcodes means two instances ");
		service.shutdown();
	}
}

class Singleton7 
{
	private static Singleton7 soleInstance;

	private Singleton7() {
		
	}

	public static Singleton7 getSoleInstance(){
			
		/**
		 * This is called double checked locking
		 * Double check is required even after synchronized because whatever inside synchronized will run slower.
		 * Consider case when, even after singleton is initialised, thread has to wait for its turn to just check one condition(soleInstance == null)
		 * Thats creepy.
		 * Imagine 1000 threads waiting for evaluating  if soleInstance == null.
		 * Thats a performance issue
		 * Best deal is to go with DCL idiom
		 */
		
			if(soleInstance == null){
				synchronized (Singleton7.class) {
					if(soleInstance == null){
						soleInstance = new Singleton7();
					}
				}
			}
		
		return soleInstance;
	}
}