package sweat.like.a.pro.singleton.breaking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Use synchronized method for getInstance
 * Unfortunately, synchronized methods run much slower -- as much as 100 times slower -- than ordinary unsynchronized methods
 * This is okay but in  a system where a singleton is a fairly complex object, it required a time to create singleton.
 * It may be possible that by the time singleton is getting created, other threads require singleton instance, so they have to wait.
 * 
 * This leads us to use synchronized at more granular level, inside method
 * 
 */
public class BreakUsingThreadsSolution1 {
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(() -> {
			Singleton6 soleInstance2 = Singleton6.getSoleInstance();
			System.out.println("hashcode : "+soleInstance2.hashCode());
		});
		
		service.submit(() -> {
			Singleton6 soleInstance3 = Singleton6.getSoleInstance();
			System.out.println("hashcode : "+soleInstance3.hashCode());
		});
		
		System.out.println("Two diffrent hashcodes means two instances ");
		service.shutdown();
	}
}

class Singleton6 
{
	private static Singleton6 soleInstance;

	private Singleton6() {
		
	}

	public static synchronized Singleton6 getSoleInstance(){
		if(soleInstance == null){
			System.out.println("Creating soleInstance");
			System.out.println("****** This will be once in entire life of this app.******");
			soleInstance = new Singleton6();
		}
		
		return soleInstance;
	}
}