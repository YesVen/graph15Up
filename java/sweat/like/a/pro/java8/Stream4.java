package sweat.like.a.pro.java8;

import java.util.Arrays;
import java.util.List;

/*
 * Problem : Check Performance of stream vs traditional loop 
 * Finally return a result.
 */

public class Stream4 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,22,35,41,50,43,7,31,20);
		
		
		//Problem : Find first number divisible by 5 in 11 in givne list of nummbers and multiply it by 4 and return result
		
		//java 7 way
		for(int num : numbers)
		{
			if(num % 11 ==0)
			{
				num *= 4;
				System.out.println(num);
				break;
			}
		}
		
		//Java 8 way		
		int result = numbers
					.stream()
					.filter(number -> number % 11 == 0)
					.map(number -> number *4)
					.findFirst()
					.orElse(0);
		
		System.out.println(result);
		
		/*
		 * Looking at above two ways of executing code, we primarily would say that java7 way is faster as it does not process elements 
		 * which are after 22(i.e. first element that matches condition)
		 * But but but  
		 * JAva Designers have made stream very very thoughtfully.
		 * They have made it elegant by adding lazy evaluation for intermediate functions like, reduce, map etc.
		 * So,
		 * What will happen here is that, java8 compiler will first see that findfirst() is called. 
		 * It will alert itself that user is interested in only first match so it will ask other methods in chain accordingly to 
		 * process in same manner.
		 * I.e. Not all elements are processed.
		 * JAVA8 WINS................................!!
		 */
		
		
		//proof of above concept for above explanation
		int val = numbers
				.stream()
				.filter(Stream4::isDivisible)
				.map(Stream4::multiplyBy4)
				.findFirst()
				.orElse(0);
	
		System.out.println(val);
		
		/*
		 * If you run the program and see console, you can see that not all elements are processed for filter an map operation.
		 * Check out the sysouts on console
		 */
	}
	
	
	
	public static boolean isDivisible(int i)
	{
		System.out.println("Inside Divisible method");
		return i%11 == 0;
	}
	
	public static int multiplyBy4(int i)
	{
		System.out.println("Inside multiply method");
		return i*4;
	}
}
