package com.java.knowhows.eg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo 
{
	public static void main(String[] args) 
	{
		List<String> words = new ArrayList<String>(Arrays.asList("Test","Lambda","To","The","Core",
				"Of","Java","8","Now"));
		
		Predicate<String> isJava = input -> input.equals("Java");
		
		Predicate <String> containsJA = input -> input.contains("Ja");
		
		Predicate<String> is8 = input -> input.equals("8");
		  words.forEach(p -> {
			  if(isJava.test(p))
			  {
				  System.out.println(p);
			  }
		  });
		  
		  words.stream().filter(isJava).forEach(s-> System.out.println(s));
		  
		words.stream().filter(isJava.and(containsJA).or(is8)).forEach(s-> System.out.println(s));
	}
}
