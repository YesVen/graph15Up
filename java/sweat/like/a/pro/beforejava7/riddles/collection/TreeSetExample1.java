package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.TreeSet;

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

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet numbers = new TreeSet<>();
			
		numbers.add(new StringBuffer("A"));
		numbers.add(new StringBuffer("Z"));
		numbers.add(new StringBuffer("X"));
		numbers.add(new StringBuffer("F"));
		
		System.out.println(numbers);
		/**
		 * We will get class cast exception because,
		 * 	 elements we inserting in treeset has to be naturally or manually comparable.
		 * Here Stringbuffer dont implement Comparable interface So while adding element in treeset
		 * system cannot call compare() method.	
		 * 
		 */
		
	}
		
}