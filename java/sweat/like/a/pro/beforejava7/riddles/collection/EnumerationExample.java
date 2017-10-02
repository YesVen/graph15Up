package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
/**

 * They are the old ancestors of iterators.
 *  
 * They are fail safe. Iterators are fail fast for Concurrent Modification. 
 * 
 * Enumeration is a legacy interface used to traverse only the legacy classes like Vector, HashTable and Stack
 * 
 * Iterator is a fail-fast in nature. i.e it throws ConcurrentModificationException if a collection is modified while iterating other than it’s own remove() method. 
 * Where as Enumeration is fail-safe in nature. It doesn’t throw any exceptions if a collection is modified while iterating. 
 * 
 * As Iterator is fail-fast in nature and doesn’t allow modification of a collection by other threads while iterating, 
 * iterator is considered as safe and secure than Enumeration.
 * 
 * Enumeration is 2x faster. 
 * 
 * 
 * itr jdk 1.2
 * enumeartiion jdk 1.0
 * 
 * 
 *
 */
public class EnumerationExample {
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		
		for(int i=0; i<10;i++)
		{
			numbers.add(i);
		}
		Enumeration<Integer> numberEnum = numbers.elements();
		while(numberEnum.hasMoreElements())
		{
			System.out.println(numberEnum.nextElement());
		}
		
		
		ArrayList<Integer> nums = new ArrayList<>(numbers);
		
	}
}
