package com.java.knowhows.eg.java8.lynda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UseComparator {

	public static void main(String[] args) {

		Comparator<String> comp = (s1, s2) -> {
			return s1.compareToIgnoreCase(s2);
		};
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");list.add("CCC");list.add("aaa");list.add("DDD");list.add("bbb");
		
		System.out.println(list);
		
		Collections.sort(list, comp);
		
		System.out.println(list);
		
	}

}
