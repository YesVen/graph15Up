package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

/**
 * Creates an object local it current thread.
 * 
 * This object is only accessed by thread in which it is created
 *
 */
public class ThreadLocalExample1 {
	public static void main(String[] args) {
		
		System.out.println("Current Executing thread is " + Thread.currentThread().getName());
		
		ThreadLocal<String> tl1 = new ThreadLocal<>();
		
		System.out.println("local value is " + tl1.get() + " beacause we have not initialised it");
		
		tl1.set("Dnyanesh");
		
		System.out.println("local value is " + tl1.get());
		
		tl1.remove();
		
		System.out.println("local value is " + tl1.get() + " because we have removed it");
		
		
		System.out.println("\n\n\nCreating new thread local variable with default value set");
		ThreadLocal<String> tl2 = new ThreadLocal<String>()
		{
			@Override
			public String initialValue()
			{
				return "default value is Ashu"; 
			}
		};

		System.out.println(tl2.get());	

	}
}
