package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *	This is concurrent list collection.
 *
 * 	It creates copy of list before a new thread trying to access it.
 * 	So each coming thread will have new version of COWAL.
 * 
 *  Suitable for concurrent read operation
 * 
 *
 */
public class CopyOnWriteArrayListExample {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> words2 = new CopyOnWriteArrayList<>();
		words2.add("Dnyanesh");// duplicates will be added
		words2.add("Dnyanesh");// duplicates will be added
		words2.addIfAbsent("Dnyanesh");//wont be added as words2 has Dnyanesh
		System.out.println(words2);
		
		//itr poiting to words2.
		//This is point when a new copy will be created. Old for iteration and new for updation. 
		Iterator<String> itr = words2.iterator();
		
		//new copy will be created and Ashu wil be added in that copy
		//but itr still points to words2.
		words2.add("Ashu");
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		
		System.out.println("\n");
		
		//This will combine all copies of words2 and print effective list at the end
		System.out.println(words2);
		
	}
}
