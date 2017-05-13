package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ParellelStream 
{
	public static void main(String[] args) 
	{
		List<String> words = new ArrayList<>(Arrays.asList("Appale","","Banana","Dog","Zebra","Apple"));
		
		words.stream().forEach(S -> System.out.println(S));
		
		Predicate<String> pred = input -> !input.equals("");
		
		words.stream().filter(pred).forEach(p -> System.out.println(p));
		
	}
}
