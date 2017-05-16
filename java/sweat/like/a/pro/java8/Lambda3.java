package java.sweat.like.a.pro.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	String fname;
	String lname;
	int age;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Person : " + this.fname + this.lname + " age :" + this.age;
	}
}


public class Lambda3 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList( new Person("Dnyanesh", "Barkade", 27),
				new Person("Amol", "Barkade", 28), 
				new Person("Niky", "Darkade", 24),
				new Person("Ashu", "Carkade", 23));
		
		//Sort
		Comparator<Person> lambdaSorter = (person1, person2) -> {
			return  person1.getFname().compareTo(person2.getFname());
		};
		Collections.sort(people,lambdaSorter);
		System.out.println(people);
		
		//print all elements in list
		
		//print all elements in list that have last name starting with B
		Printer lamdaPrinter = (person) -> {
			if(person.getLname().startsWith("B"))
			{
				System.out.println(person);
			}
		};
		
		for(Person p : people)
		{
			lamdaPrinter.print(p);
		}
		

	}

}



interface Printer
{
	public void print(Person p);
}
