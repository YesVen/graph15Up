package sweat.like.a.pro.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

/*
 * Problem : multiply each number from numbers list by two and add them. 
 * Finally return a result.
 */

public class Stream2 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		System.out.println(numbers.stream().map(number -> number * 2).reduce( (val1, val2) -> val1 + val2 ));
		
		System.out.println(numbers.stream().map(number -> number * 2).reduce(0, (val1, val2) -> val1 + val2 ));
		
		//Lets dive in details
		Stream<Integer> intstream = numbers.stream();
		
		//Function is functional interface having method apply
		// Function is type that accepts one value and returns one value
		//Predicate is a type that accepts one value and returns boolean
		Function<Integer, Integer> mapFunction =  new Function<Integer, Integer>() {
			public Integer apply(Integer value)
			{
				return value *2;
			}
		};
		
		intstream = intstream.map(mapFunction);
		
		//BinaryOperator is functional interface having method apply
		//It accepts two arguments of same type and returns same type object
		BinaryOperator<Integer> bin = new BinaryOperator<Integer>() {
			public Integer apply(Integer val1 , Integer val2)
			{
				return val1 + val2;
			}
		};
		
		//Optional is container object which may or may not have a value. 
		//This has been introduced to avoid infamous null pointer exception
		Optional<Integer> opt =  intstream.reduce(bin);
		
		System.out.println(opt.isPresent() ? opt.get() : "No value returned");
	}
}
