package sweat.like.a.pro.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		
		//Converting list to map
		Map<Integer, Integer> collect = Stream.of(11,34,4,5,56,3).collect(Collectors.toMap(key -> key, key->key+1));
		
		System.out.println(collect);
		
		Integer ing = Stream.of(11,34,4,5,56,3).reduce((arg1,arg2)-> arg1+arg2).orElse(10000);
		
		System.out.println(ing);
		
		
	}
}
