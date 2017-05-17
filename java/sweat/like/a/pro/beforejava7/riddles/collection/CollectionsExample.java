package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		
		List<Village> ss = new ArrayList<>(10);
		System.out.println(ss.size());
		
		
		//Create a collection using Arrays class
		List<Village> villages = Arrays.asList(new Village("Padali"),
					  new Village("Bori"),
					  new Village("Nimbodi"),
					  new Village("Sukhed"));
		
		System.out.println(villages.size());
		
		//create a copy
		List<Village> villagesCopy = new ArrayList<>(villages.size());
		
		System.out.println(villagesCopy.size());
		Collections.copy(villagesCopy, villages); 
		
		System.out.println(villagesCopy);
		
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