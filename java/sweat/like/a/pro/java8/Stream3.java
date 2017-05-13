package sweat.like.a.pro.java8;

import java.util.Arrays;
import java.util.List;

/*
 * Problem : make sum of all numbers which are divisible by 5 
 * Finally return a result.
 */

public class Stream3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,22,35,41,50,43,7,31,20);
		
		int result = numbers.stream().filter(number -> number % 5 == 0).reduce((val1, val2)-> val1+val2).get();
		
		System.out.println(result);
		
		/*
		 * find all numbers divisible by 2 and return result of multiplying by 5 for each of them
		 */
		
		int val  = numbers.stream().filter(number -> number%2 ==0).map(number -> number * 5).reduce((val1, val2) -> val1 + val2).get();
		System.out.println(val);
		
		
		/*
		 * find a first number in given list divisible by 3. If not found return 0
		 */
		
		System.out.println(numbers.stream().filter(number -> number %3 == 0).findFirst());
		System.out.println(numbers.stream().filter(number -> number %3 == 0).findFirst().orElse(0));
		
		
	}
}
