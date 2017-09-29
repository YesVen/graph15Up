package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * This is very very weak Map Collection
 * 
 * When garbage collector sees some keys of this WeakHashmap are ready for garbage collection,
 * 		GC will simply garbage collect it. As WeakHashMAp is weak it will allow this process.
 * 
 * 
 * But HashMap is stronger than GC. It will give left and right to garbage collector 
 * if GC tries to delete objects when are used in hashmap 
 * 
 * 
 * Weakhashmap is used in memory intensive applications where freeing up memory is more important than
 * holding onto weak references. 
 * 
 * @author Nightfury
 *
 */
public class WeakHashMapExample {
	public static void main(String[] args) throws InterruptedException {
		HashMap map1 = new HashMap<>();
		Temp t = new Temp();
		map1.put(t, "Dnyanesh");
		
		
		t= null; //means ready for garbage collection
		System.out.println(map1);
		
		System.gc();//Hashmap is stronger than gc, it will not allow deleting t at any cost
		Thread.sleep(5000);
		System.out.println(map1);
		
		testWeakHashMap();
	}

	private static void testWeakHashMap() throws InterruptedException 
	{
		WeakHashMap map1 = new WeakHashMap<>();
		Temp t = new Temp();
		map1.put(t, "Dnyanesh");
		
		
		t= null; //means ready for garbage collection
		System.out.println(map1);
		
		System.gc();//GC is stronger than weakhashmap, it will delete at any cost
		Thread.sleep(5000);
		System.out.println("Weakhashmap : " +map1);
	
	}
}


class Temp
{
	@Override
	public String toString() {
		return "Temp";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finilizing");
	}
}
