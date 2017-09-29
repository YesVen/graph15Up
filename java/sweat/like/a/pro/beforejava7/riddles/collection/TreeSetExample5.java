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

public class TreeSetExample5 {

	/*
	 * Program to preserve insertion order using treeset
	 */
	public static void main(String[] args) {
		
		Comparator lambdaComparator = (obj1, obj2) ->  1;
		TreeSet numbers = new TreeSet<>(lambdaComparator);
		
		numbers.add(10);
		numbers.add(2);
		numbers.add(56);
		numbers.add(20);
		numbers.add(20);
		
		System.out.println(numbers);
		
		
		
		
	}

	
	
}
