package com.java.knowhows.eg.java8.lynda.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonPredicate {

	public static void main(String[] args) 
	{
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Dnyanesh", 27));
		people.add(new Person("Pritesh", 24));
		people.add(new Person("Mukesh", 21));
		
		Predicate<Person> oldest = new Predicate<Person>() {
			@Override
			public boolean test(Person t) {
				return t.getAge() >= 25;
			}
		};
		
		Predicate<Person> youngest = person -> person.getAge()<22;
		
		Predicate<Person> startswithM = person -> person.getName().charAt(0) == 'M';
		
		people.forEach(p -> {
			if(oldest.test(p))
			{
				System.out.println(p);
			}
		});
		
		people.stream().filter(youngest).forEach(name -> System.out.println(name));
		
		people.stream().filter(youngest.and(startswithM)).forEach(name -> System.out.println(name));
		
		
	}
	
}
