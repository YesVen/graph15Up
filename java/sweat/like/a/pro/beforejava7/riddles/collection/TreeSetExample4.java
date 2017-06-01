package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.Comparator;
import java.util.TreeSet;

import sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8.lynda.predicate.Person;

/**
 * Duplicates are not allowed
 * 
 * Elements are inserted in some sorting order
 * 		numbers : ascending order
 * 		strings : alphabetical order
 * 
 * Insertion order is not preserved
 * 
 * Backing Data structure is Balanced Tree(in java 7 onwards : its TreeMap - > see add method in Treeset class)
 * 
 * Heterogenous objects are not allowed
 * 				Class Cast Exception
 * 
 * null insertion is allowed but only ONCE
 *		Till java 6 it is ok to add first element a null to treeset
 *		But it considered as bug
 *		From java 7 onwards null cannot ne inserted if natural sorting order is used.
 *		If you want to insert a null element then u have to write custom comparator for that type.	 
 * 
 * @author Nightfury
 *
 */

public class TreeSetExample4 {

	public static void main(String[] args) {
		
		test1();
		
		test2();
		
		test3();
		
		test4();
	}

	private static void test2() {
		/*
		 * Add numbers in treeset in descending order
		 */
		
		@SuppressWarnings("unchecked")
		TreeSet numbers = new TreeSet<>(new Comparator() {
			public int compare(Object o1, Object o2)
			{
				Integer num1 = (Integer) o1;
				Integer num2 = (Integer) o2;
				
				return - num1.compareTo(num2);
			} 
		});
		
		numbers.add(new Integer(10));
		numbers.add(new Integer(20));
		numbers.add(new Integer(5));
		numbers.add(new Integer(1));
		
		System.out.println(numbers);
	}

	private static void test1() {
		/*
		 * Add numbers in treeset in descending order
		 */
		
		TreeSet numbers = new TreeSet<>(new Comparator() {

			public int compare(Object num1, Object num2) {
				return (Integer)num2 - (Integer)num1;
			}
		});
		
		
		numbers.add(new Integer(3));
		numbers.add(new Integer(1));
		numbers.add(new Integer(6));
		numbers.add(new Integer(20));
		
		System.out.println(numbers);
	}

	private static void test3() {
		/*
		 * Add words in treeset in descending order
		 */
		
		TreeSet numbers = new TreeSet<>((obj1, obj2) -> obj1.toString().compareTo(obj2.toString()));	
		
		numbers.add("Raja");
		numbers.add("Rama");
		numbers.add("Pooja");
		numbers.add("Pune");
		
		System.out.println(numbers);
	}
	
	
	private static void test4() {
		/*
		 * Insert stringbuffer objects in treeset
		 */
		
		TreeSet numbers = new TreeSet<>((obj1, obj2) -> {
			
			StringBuffer sb1 = (StringBuffer) obj1;
			StringBuffer sb2 = (StringBuffer) obj2;
			
			return sb1.toString().compareTo(sb2.toString());
			
		});	
		
		numbers.add(new StringBuffer("Raja"));
		numbers.add(new StringBuffer("Rama"));
		numbers.add(new StringBuffer("Pooja"));
		numbers.add(new StringBuffer("Pune"));
		
		
		System.out.println(numbers);
	}
	
}
