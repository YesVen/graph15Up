package sweat.like.a.pro.beforejava7.riddles;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * http://www.journaldev.com/129/how-to-create-immutable-class-in-java
 * 1.	Make all fields private and final.
 * 2.	Don't expose setters
 * 3.	Initialize all fields by deep copy of constructor 
 * 4.	Declare class as final
 * 5.	In getter method, return clone of objects rather than returning exact object references
 * 
 * @author DBE1
 *
 */


public class HowToCreateFinalClass {
	public static void main(String[] args) {
		
		int demoage = 10;
		String demoName = "dnyanesh";
		HashMap<String, String> demoInfo = new HashMap<>();
		demoInfo.put("nativePlace", "Padali");
		demoInfo.put("company", "3ds");
		
		FinalPerson dnyanesh = new FinalPerson(demoage, demoName, demoInfo);
		
		System.out.println(dnyanesh);
	}
}


final class FinalPerson
{
	private final int age;
	private final String name;
	private final HashMap<String, String> info;
	
	public FinalPerson(int age, String name, Map<String, String> info)
	{
		this.age = age;
		this.name = name;
		HashMap<String, String> tempMap = new HashMap<>();
		
		//for initialising info object dont use assignment, instead create deep copy
		Iterator<String> iter = info.keySet().iterator();
		while(iter.hasNext())
		{
			tempMap.put(iter.next(),info.get(iter.next()));
		}
		 
		this.info = tempMap;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	// don't return a actual object reference
	public Map<String, String> getInfo() {
		return (Map<String, String>) this.info.clone();
	}
	
	@Override
	public String toString()
	{
		return this.age + " " + this.name + " "+ this.info;
	}
	
}