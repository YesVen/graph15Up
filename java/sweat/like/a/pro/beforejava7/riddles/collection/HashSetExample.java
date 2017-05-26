package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Duplicates not allowed
 * Null insertion allowed
 * Insertion order is not preserved
 * Backing collection is Hashtable/Hashmap So search operation is fast
 * Preferred when we need to search elements in collection
 * 
 * @author Nightfury
 *
 */
public class HashSetExample {
	public static void main(String[] args) {
		Set<String>	names = new HashSet<>();
		
		names.add("Dnyanesh");
		names.add("Amol");
		
		//This will not cause exception but it will simply return false meaning that duplicates are not allowed
		names.add("Dnyanesh");
		
		
		
	}
}
