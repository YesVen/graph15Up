package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
		List<String> words1 = new ArrayList<String>();
		
		words1.add("Dnyanesh");
		words1.add("Amol");
		words1.add("Dnyanesh");
		
		System.out.println(words1);
		
		//lets use unusual constructor
		CopyOnWriteArrayList<String> words2 = new CopyOnWriteArrayList<>(words1);
		
		words2.add("Dnyanesh");// duplicates will be added
		
		words2.addIfAbsent("Dnyanesh");//wont be added as words2 has Dnyanesh
		
		System.out.println(words2);
		
		words2.addAll(words1);//words1 list added to words2
		
		words2.addAllAbsent(words1);// all items in words1 already there in words2, So nothing will be added
		
		
		// this will not 11throw UnsupportedOperationException. 
		//Remember if only iterator tried to remove then OPE will be thrown
		Thread t1 = new Thread(() -> words2.remove(0));
		t1.start();
		
		// this will not 11throw UnsupportedOperationException. 
		//Remember if only iterator tried to remove then OPE will be thrown
		Thread t2 = new Thread(() -> words2.remove(0));
		t2.start();
		
		
		ListIterator<String> itr = words2.listIterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			
			/*
			 * THIS WILL THROW UNSUPPORTED OPERATION EXCEPTION
			 */
			itr.remove();
		}
		
		
		
	}
}
