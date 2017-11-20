package sweat.like.a.pro.beforejava7.riddles.exception;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UnsupportedOperationExceptionExample {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("dnyanesh");
		
		List<String> list2 =   Collections.unmodifiableList(list);
		
		list2.add("This will throw exception");
		
		/*
		 * This will also be thrown if we try to remove elements from collection(other than iterator's own remove method)
		 * while using iterator
		 * Since iterators are fail fast in nature
		 */
	}
