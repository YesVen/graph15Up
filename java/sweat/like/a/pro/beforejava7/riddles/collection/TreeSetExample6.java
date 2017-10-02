package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.TreeSet;

import sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8.lynda.predicate.Person;

/**
 * Duplicates are not allowed
 * 
 * Elements are inserted in some sorting order
 * 		numbers : ascending order
 * 		strings : alphabetical order
 * 
 * Insertion order is not preserved
 * 
 * Backing Data structure is Balanced Tree(in java 7 onwards : its TreeMap - > see add method in Treeset class)
 * 
 * Heterogenous objects are not allowed
 * 				Class Cast Exception
 * 		BUT IF WE DEFINE OUR OWN SORTING BY IMPLEMENTING COMPARATOR INTERFACE THEN WE CAN ADD 
 * 		HETEROGENOUS OBJECTS ALSO.		
 * 
 * 
 * null insertion is allowed but only ONCE
 *		Till java 6 it is ok to add first element a null to treeset
 *		But it considered as bug
 *		From java 7 onwards null cannot ne inserted if natural sorting order is used.
 *		If you want to insert a null element then u have to write custom comparator for that type.	 
 * 
 * @author Nightfury
 *
 */
class Employee implements Comparable
{
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return this.name + " -- " + this.id;
	}
	

	@Override
	public int compareTo(Object o) 
	{
		if(o instanceof Employee)
		{
			return this.id - ((Employee)o).id;
		}
		
		return 0;
	}
}




public class TreeSetExample6 {

	public static void main(String[] args) {
		
		TreeSet workers = new TreeSet<>((obj1, obj2) -> {
			if(obj1 instanceof String)
			{
				return -1;
			}
			else if(obj1 instanceof Person)
			{
				return ((Person) obj1).getAge() - ((Employee)obj2).id;
			}
			else if(obj1 instanceof Employee)
			{
				return ((Employee) obj1).compareTo(obj2);
			}
			return 0;
		});
		
		workers.add(new Employee(100, "Dnyanesh"));
		workers.add(new Employee(700, "Amol"));
		workers.add(new Employee(200, "Pritesh"));
		workers.add(new Employee(400, "Mukesh"));
		workers.add(new Employee(200, "Shashi"));
		workers.add(new Employee(100, "Ashu"));
		
		workers.add(new Person("Strange Person Object in Employee Set", 23));
		//ClassCastException should be thrown but we handled it in comparator.
		
		
		
		System.out.println(workers);
		
	}

	
	
}
