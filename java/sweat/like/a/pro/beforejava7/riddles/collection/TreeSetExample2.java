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

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet numbers = new TreeSet<>();
		
		numbers.add("a"); // ascii code 97
		numbers.add("A"); //ascii code 65
		numbers.add("B");
		numbers.add("Z");
		numbers.add("L");
		
		System.out.println(numbers);
		
		//numbers.add(new Integer(12));// ClassCastException
		
		//numbers.add(null); //NullPointerException
		
		
		testNullForCustomObject();
		
		
	}

	
	/**
	 * I am confused here...need more study here
	 */
	private static void testNullForCustomObject() {
		
		TreeSet<Person> persons = new TreeSet<>();
		
		
		Comparator<Person> comp = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				 if (o1 == null || o2 == null)
				 {
					 return 1;
				 }
				return 1;
			}
		};
		
			persons.add(null);
		
		System.out.println(persons);
		
				
		
		
	}
	
}
