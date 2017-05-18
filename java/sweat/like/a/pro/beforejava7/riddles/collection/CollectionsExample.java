package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 *	 
 * 
 * @author DBE1
 */
public class CollectionsExample {
	public static void main(String[] args) 
	{
		
		copy();
		
		addAll();
		
		testCheckedColletion();
	}

	

	private static void testCheckedColletion() {
		List<Village> villages = new ArrayList<>();
		villages.add(new Village("Bori"));
		villages.add(new Village("Nimbodi"));
		villages.add(new Village("Sukhed"));
		
		Collections.checkedCollection(villages, Village.class);
		
		//Now this colletion is checked colletion meaning that 
		//If I try to add object of type other than Village then it will give me ClassCastException
	}

	private static void addAll() {
		//Create a collection using Arrays class
		List<Village> villages = new ArrayList<>();
		villages.add(new Village("Bori"));
		villages.add(new Village("Nimbodi"));
		villages.add(new Village("Sukhed"));
		
		//this is beautiful way to add new elements in collection
		Collections.addAll(villages, new Village("X"));
		System.out.println(villages);
	}

	private static void copy() 
	{
		List<Village> ss = new ArrayList<>(10);
		System.out.println(ss.size());
		
		
		//Create a collection using Arrays class
		List<Village> villages = Arrays.asList(new Village("Padali"),
					  new Village("Bori"),
					  new Village("Nimbodi"),
					  new Village("Sukhed"));
		
		/*
		 * This will throw UnsupportedOperationException since AsList API uses private inner class ArrayList and not java.util.ArrayList
		 * Private inner class ArrayList dont have add method.
		 */
		villages.add(new Village("Lonand") );
		System.out.println(villages.size());
		
		//create a copy
		List<Village> villagesCopy = new ArrayList<>(villages.size());
		System.out.println(villagesCopy.size());
		
		//Copy method of collections will works only on list type
		//Collections.copy(villagesCopy, villages); //This will throw an error but why???????
		System.out.println(villagesCopy);
		
		//This will similar like copy constructor
		List<Village> villagesCopy2 = new ArrayList<>(villages);
		System.out.println(villagesCopy2.size());
		
		//What if destination list already has elements......copy method will replace the elements in destination collection
		List<Village> oldVillages = Arrays.asList(new Village("A"),new Village("B"),new Village("C"),new Village("D"));
		System.out.println(oldVillages);
		Collections.copy(oldVillages, villages);
		System.out.println(oldVillages);
		
		//copy method will replace the elements in destination collection and remaining elements in detination colletion will remain as it is
		List<Village> w1 = Arrays.asList(new Village("A"),new Village("B"),new Village("C"),new Village("D"), new Village("E"));
		System.out.println(w1);
		Collections.copy(w1, villages);
		System.out.println(w1);
		
	}
	
	
}




class Village
{
	
	private String name;

	public Village(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return this.name;
	}
}

class Gav extends Village
{

	public Gav(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

