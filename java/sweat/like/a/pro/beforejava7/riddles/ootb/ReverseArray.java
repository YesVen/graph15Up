package sweat.like.a.pro.beforejava7.riddles.ootb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;


public class ReverseArray {

	public static void main(String[] args) {
		String[] words = {"Dnyanesh", "Ashu", "Nikhil", "Abhi","Amol"};
		
		way1(words);
		
		way2(words);
		
		//smart way
		smartway(words);
		
		modernSmartWay(words);
	}

	private static void modernSmartWay(String[] words) {
		
		Object ff[] =  Arrays.asList(words).stream().sorted(Collections.reverseOrder()).toArray();
		
		System.out.println(Arrays.toString(ff));
		
		//Collections.reverse(Arrays.asList(words));
	}

	/*
	 * Swap the elements keeping center as it is
	 */
	private static void smartway(String[] words) {
		for(int i=0; i<words.length/2; i++)
		{
			String temp = words[i];
			
			words[i] = words[words.length -i -1];  
					
			words[words.length - i-1] = temp;
		}
		
		System.out.println("By most efficient way : " + Arrays.toString(words));
	}

	private static void way2(String[] words) {
		Map<String, String> map = new HashMap<String, String>();
		int i = words.length-1;
		for(String s : words)
		{
			map.put(Integer.toString(i), s);
			i--;
		}
		
		String[] reversed = new String[words.length];
		for(Entry<String, String> e : map.entrySet())
		{
			reversed[Integer.valueOf(e.getKey())] = e.getValue();
		}
		System.out.println(Arrays.toString(reversed));
		
	}

	private static void way1(String[] words) {
		String[] reversed = new String[words.length];
		int j=0;
		for(int i=words.length-1; i>=0; i--)
		{
			reversed[j] = words[i];
			j++;
		}
		
		System.out.println(Arrays.toString(reversed));
	}
}
