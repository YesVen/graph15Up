package sweat.like.a.pro.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Dnyanesh", "Barkade", 28),
				new Person("Ashu", "Barkade", 24),
				new Person("toDecide", "Barkade", 1));
		
		//For in loop
		for(Person p : people)
		{
			System.out.println(p);
		}
		
		//java 8 way : for each loop
		System.out.println("This is for each way of iterating\n");
		people.forEach(p -> System.out.println(p));
		
		//slightly similar but more handy
		System.out.println("This is for each way of iterating using method references\n");
		people.forEach(System.out::println);
	}
}

