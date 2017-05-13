package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SequencialStream 
{
	public static void main(String[] args) 
	{
		List<String> words = new ArrayList<>(Arrays.asList("Appale","","Banana","Dog","Zebra","Apple"));
		
		Predicate<String> pred = input -> !input.equals("");
		
		Stream<String> wordStream = words.parallelStream().filter(pred);
		wordStream.forEach(p -> System.out.println(p));
		
		
		//now lets see how millions objects can be processed in parallel
		
		List<String> strings = new ArrayList<>();
	    for (int i = 0; i < 10000; i++) 
	    {
	        strings.add("Item " + i);
	    }
	    
	    strings.parallelStream().forEach(p -> System.out.print("  "+p));
	    

	}
}
