package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.TreeMap;

/**
 *	 Underlying Data structure is RED-BLACK Tree	
 *	
 *	Insertion Order is not preserved
 *
 *	Elements are Sorted according to sorting order of keys
 * 
 * 	Duplicate keys are not allowed but values are
 * 
 * 	Heterogenous Keys : 
 * 			Not allowed if we depend on default natural sorting order(Key should be homogenous and Comparable)
 * 			Allowed if we implement comparator interface for type used as key
 * 
 * 	NUll acceptance : 
 * 			Till jdk 1.6, null is allowed as first key for first entry but it would make this treemap
 * 				unusable as inserting second element will cause NPE
 * 			In jdk 7 its considered as bug and null insertion of key is not allowed.
 */

public class TreeMapExample2 {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap<>();
		
		map.put(new Integer(12), "Twelve");
		
		//map.put("SS", "Twelve"); classClastException will be generated
		
		//map.put(new Person("sdads", 12), "waew"); classClastException : PErson cannot be casr to Comparable
		
		map.put(new Integer(10), "Ten");
		
		System.out.println(map);
	}
}
