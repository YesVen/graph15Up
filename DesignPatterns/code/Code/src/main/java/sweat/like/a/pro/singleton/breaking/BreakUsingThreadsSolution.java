package sweat.like.a.pro.singleton.breaking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BreakUsingThreads {
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(() -> {
			SingleTon4 soleInstance2 = SingleTon4.getSoleInstance();
			System.out.println("hashcode : "+soleInstance2.hashCode());
		});
		
		service.submit(() -> {
			SingleTon4 soleInstance3 = SingleTon4.getSoleInstance();
			System.out.println("hashcode : "+soleInstance3.hashCode());
		});
		
		System.out.println("Two diffrent hashcodes means two instances ");
		service.shutdown();
	}
}

class SingleTon4 
{
	private static SingleTon4 soleInstance;

	private SingleTon4() {
		
	}

	public static SingleTon4 getSoleInstance(){
		if(soleInstance == null){
			System.out.println("Creating soleInstance");
			System.out.println("****** This will be once in entire life of this app.******");
			soleInstance = new SingleTon4();
		}
		
		return soleInstance;
	}
}