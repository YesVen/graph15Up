package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

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
