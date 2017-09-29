package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {
	public static void main(String[] args) {

		frequency();
		
		synchronisedCollection();
	}
	
	private static void synchronisedCollection() {
		
		/*
		 * Collections.synchronizedList() will synchronize all the accesses to the backed list except 
		 * while iterating which still need to be done in a synchronized block with the synchronized List instance as object's monitor.
		 * 
		 * So there is an advice that you must iterate over Collections.synchronized collection within 
		 * synchronized block   
		 * 
		 * The list being synchronized only means that add, remove etc. operations are synchronized.
		 */
		
		List<Village> villages = getCollection();
		List<Village> v1 = Collections.synchronizedList(villages);
		
	}

	private static void frequency() {
		List<Village> villages = getCollection();
		Village v1 = new Village("Bori");
		villages.add(v1);
		villages.add(v1);
		villages.add(v1);
		System.out.println(Collections.frequency(villages, v1));
	}

	public static List<Village> getCollection()
	{
		List<Village> villages = new ArrayList<>();
		villages.add(new Village("Bori"));
		villages.add(new Village("Nimbodi"));
		villages.add(new Village("Sukhed"));
		return villages;
	}
}
