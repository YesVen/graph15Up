package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.Hashtable;

/**
 *	From jdk v1.2 onwards it is changed to implement Map interface to make it part of Collection framework
 *	
 *	Legacy Class with hashtable as its backing Ds
 *
 * 	11 is initial capacity (not 16) and loading factor 0.75
 * 
 *  Its threadsafe and best suited for search operation
 *  
 *  ******** NUll kays and values are not allowed **********
 *  
 */

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable table = new Hashtable<>(); // default size 11

		
		// RTE : NUllpointer Exception because we cannot compute null.hashcode()
 		//table.put(null, "Test");
		
		// RTE : NUllpointer Exception because there is an explicit check by java designers about null value
 		//table.put(null, "Test");
		
		System.out.println(table);
		
		table.put(new T(), "sdada");
	}
}


class T{
	
}