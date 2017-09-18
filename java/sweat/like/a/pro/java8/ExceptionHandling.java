package sweat.like.a.pro.java8;

import java.util.function.BiConsumer;

public class ExceptionHandling {
	public static void main(String[] args) {
		int [] numbers = {2,3,5,6,5,8};
		int key = 0;
		
		process(numbers,key, wrapperLambda((a, b)-> System.out.println(a /b)));
		
	}
	
	//This function is optimised. We have passed in behaviour of ADD, SUBTRACT, DIVIDE etc to this function.
		//So this function does all mathematical operation not just Addition of two numbers
		private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
			for(int a : numbers)
			{
				consumer.accept(a, key);
			}
		}
		
		
		//THis is safe place for a exption handling
		//This function can be used as generic function for exception handling for all methods which takes two arguments and do processing 
		private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer)
		{
			return (a,b) -> 
			{
				try
				{
					consumer.accept(a, b);
				}
				catch(ArithmeticException xx)
				{
					System.out.println("Arithmetic Exception happened");
				}
			};
		}
		
}
