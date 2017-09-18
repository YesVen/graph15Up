package sweat.like.a.pro.java8;

import java.util.Arrays;
import java.util.List;

public class Streams1 {
public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Dnyanesh", "Barkade", 28),
				new Person("Ashu", "Barkade", 24),
				new Person("toDecide", "Barkade", 1),
				new Person("toDecide", "Darkade", 1));
		
		//print father
		people.stream()
			.filter(p -> p.getFname().equals("Dnyanesh")) // this is called intermediate operation
			.forEach(p -> System.out.println(p)); // this is called terminal operation
		
		//print children
		people.parallelStream().filter(p -> p.getFname().equals("toDecide"))
		.forEach(p -> System.out.println(p));
	}
}
