package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8.lynda.methodreferences;

import java.util.ArrayList;
import java.util.Collections;

public class MethodReference {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("Bonjour");
		words.add("Hi");
		words.add("World");
		words.add("People");
		
		words.stream().forEach(System.out::println);
		
		Collections.sort(list, c);
	}

}

class Person
{
	public int getAge()
	{
		return 26;
	}
}