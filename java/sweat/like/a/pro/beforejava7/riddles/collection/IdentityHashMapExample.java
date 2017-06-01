package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

/**
 * 
 * This is exactly same as HashMap including methods and constructors 
 * 		Except It does not use equals method for comparison
 * 			   It uses == operator.
 * 
 * @author Nightfury
 *
 */


public class IdentityHashMapExample {
	public static void main(String[] args) {
		  
		HashMap map1 = new HashMap<>();
		map1.put(new Integer(10), "Dnyanesh");
		map1.put(new Integer(10), "Amol");
		
		//It will use equals to check for duplicate keys and when found it will replace
		//duplicate ENTRY objects in map
		System.out.println(map1);
		
		//but
		IdentityHashMap map2 = new IdentityHashMap<>();
		map2.put(new Integer(10), "Dnyanesh");
		map2.put(new Integer(10), "Amol");
		
		
		//But here JVM will do == comparison of keys, so both objects are allowed
		System.out.println(map2);
	}
}
