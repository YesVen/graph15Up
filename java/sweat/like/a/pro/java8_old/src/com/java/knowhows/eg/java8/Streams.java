package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams 
{

	public static void main(String[] args) 
	{
		List<String> words = new ArrayList<String>(Arrays.asList("mod","prod", "DEU","add",
				"person","person"));
		
		System.out.println(words.stream().anyMatch(iput -> iput.equals("prod")));
		
		System.out.println(words.stream().allMatch(input -> input instanceof String));
		
		System.out.println(words.stream().count());
		
		words.stream().distinct().forEach(input -> System.out.print(input+ " "));
		
		Optional<String> optional = words.stream().findFirst();
		
		System.out.println(optional.orElse( "sadasd"));
		
		words.stream().map(input -> input.toUpperCase()).forEach(input -> System.out.print(input));
		
		words.stream().map(input -> input.toUpperCase()).forEach(System.out :: println);
		
		Stream<Integer> nums = Stream.of(1,2,3,4,45,5,6,7,7,8,899,9,9);
		 nums.forEach(System.out::print);
		 
		 
		
	}

}

















