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




final class FinalPerson
{
	private final int age;
	private final String name;
	private final HashMap<String, String> info;
	
	//TODO : Handle this object
	private final Address address;
	
	public FinalPerson(int age, String name, Map<String, String> info, Address address)
	{
		//No need to take precaution for primitive or immutable things
		this.age = age;
		this.name = name;

		
		
		//set address
		Address addr = new Address();
		addr.street = address.street;
		addr.code = address.code;
		this.address = addr;
		//this.address = address >>>>>>>>>> dont do this.
		
		
		
		//set info map
		final HashMap<String, String> tempMap = new HashMap<>();
		//for initialising info object dont use assignment, instead create deep copy
		Iterator<String> iter = info.keySet().iterator();
		String key;
		while(iter.hasNext())
		{
			key = iter.next();
			tempMap.put(key,info.get(key));
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


class Address {
	String street;
	int code;
}

public class HowToCreateFinalClass {
	public static void main(String[] args) {
		
		int demoage = 10;
		String demoName = "dnyanesh";
		HashMap<String, String> demoInfo = new HashMap<>();
		demoInfo.put("nativePlace", "Padali");
		demoInfo.put("company", "3ds");
		
		Address address = new Address();
		address.street = "Khandoba Mandir";
		address.code = 415521;
		
		FinalPerson dnyanesh = new FinalPerson(demoage, demoName, demoInfo, address);
		
		System.out.println(dnyanesh);
		
		demoInfo.put("dummyKey", "Hacked");
		
		//If we have not created deep copy constructor then we would be able to change dnyanesh object by putting a new key inside dnyanesh object 
		System.out.println(dnyanesh);
	}
}