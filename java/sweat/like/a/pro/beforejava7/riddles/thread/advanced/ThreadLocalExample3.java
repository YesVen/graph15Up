package sweat.like.a.pro.beforejava7.riddles.thread.advanced;

/**
 * Creates an object local it current thread.
 * 
 * This object is only accessed by thread in which it is created
 *
 */
public class ThreadLocalExample3 {

	static ThreadLocal<String> local = new ThreadLocal<>();
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			local.set("Dnyanesh");
			System.out.println("Local Value is in t2 is " + local.get());
			Thread t2 = new Thread(()->{
				System.out.println("Local Value is in t2 is " + local.get());
			},"t2");
			t2.start();
		},"t1");	
		
		t1.start();
	}
}