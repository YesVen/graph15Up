package java.sweat.like.a.pro.java8;

public class Lambada1 {

	public static void main(String[] args) {
		
		Lambada1 test = new Lambada1();
		test.test();
	}
	
	public void test(){
		//Example 1
		Greeting  lambdaGreeting = () -> {
			System.out.println("Hellow World");
		};
		lambdaGreeting.greet();
		
		
		//Example 2
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Inside Inner class run method");
			}
		};
		Thread t= new Thread(runnable);
		t.start();//this is normal way
		Runnable lambdaRunnable = () -> System.out.println("Inside Lambda Run method");
		lambdaRunnable.run();// this is lambda way. See that lot of boiler plate code of anonymous inner class is not required
		
	}
	
	
	@FunctionalInterface // this makes sure that no method is allowed in side Greeting interface except greet method
	interface Greeting
	{
		public void greet();
	}
	
	
}
