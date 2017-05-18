package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllVsClear {
	public static void main(String[] args) {
		List<Village> villages = new ArrayList<>(10);
		Village v1 = new Village("A");
		Village v2 = new Village("A");
		Village v3 = new Village("A");
		
		
		//villages.add(3,v1); This throws runtime error as list.size() is 0 still we are adding element at 3rd position
		villages.add(v2);
		villages.add(v3);
		villages.add(new Village("D"));
		villages.add(new Village("E"));
		villages.add(new Village("F"));
		villages.add(new Village("G"));
		
		
		
		List<Village> villagesToRemove = new ArrayList<>();
		
		villagesToRemove.add(v1);
		villagesToRemove.add(v2);
		
		
		//This will check each element in villagesToREmove to see if it is present in
		// villages. If present simply remove
		villages.removeAll(villagesToRemove);
		System.out.println("Villages are  " + villages);
		
		
		List<Village> villagesToKeep = new ArrayList<>();
		villagesToKeep.add(v3);
		//retainAll removes all elements except passed collection elements
		villages.retainAll(villagesToKeep);
		System.out.println("Villages are  " + villages);
		
		//clears all elements
		villages.clear();
		System.out.println("Villages are  " + villages);
		
		
		//Collection classes allows heterogeneous objects except Treeset and TreeMap
		List ss = new ArrayList<>();
		ss.add(new Village("dsds"));
		ss.add(new RemoveAllVsClear());
		ss.add(new CollectionsExample());
		ss.add(null);
		System.out.println(ss);
		
	}
}
