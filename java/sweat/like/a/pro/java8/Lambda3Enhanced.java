package java.sweat.like.a.pro.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda3Enhanced {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList( new Person("Dnyanesh", "Barkade", 27),
				new Person("Amol", "Barkade", 28), 
				new Person("Niky", "Darkade", 24),
				new Person("Ashu", "Carkade", 23));
		
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		performConditionally(people, p -> p.getFname().startsWith("D"), p -> System.out.println(p.getFname()));
	}

	public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer)
	{
		for(Person p : people)
		{
			if(predicate.test(p))
			consumer.accept(p);
		}
	}
}

