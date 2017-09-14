package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
/**
 * They are the old ancestors of iterators.
 * 
 * Faster than iterators but cannot move backwords. Only forward direction. 
 * 
 * They are fail safe. Iterators are fail fast for Concurrent Modification. 
 * 
 * @author DBE1
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
