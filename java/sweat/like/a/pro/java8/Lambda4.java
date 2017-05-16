package java.sweat.like.a.pro.java8;

import java.util.function.BiConsumer;

public class Lambda4 {
	public static void main(String[] args) {
		int [] numbers = {2,3,5,6,5,8};
		int key = 2;
		//java 7 way
		process(numbers, key);
		
		//java 8 way
		lambdaProcess(numbers,key, (a, b)-> System.out.println(a +b));
		lambdaProcess(numbers,key, (a, b)-> System.out.println(a -b));
		lambdaProcess(numbers,key, (a, b)-> System.out.println(a * b));
		lambdaProcess(numbers,key, (a, b)-> System.out.println(a + b *2));
	}
	
	//This function is optimised. We have passed in behaviour of ADD, SUBTRACT, DIVIDE etc to this function.
	//So this function does all mathematical operation not just Addition of two numbers
	private static void lambdaProcess(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int a : numbers)
		{
			consumer.accept(a, key);
		}
	}

	//This function sitting there and just performing ADD operation 
	public static void process(int[] numbers, int key )
	{
		for(int a : numbers)
			{
				System.out.println(a + key);
			}
	}
}
