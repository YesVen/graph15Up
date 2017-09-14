package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("One");
		list.add("Two");
		System.out.println(list);
		
		list.addFirst("Zero");
		list.addLast("Three");
		System.out.println(list);
		
		//Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(list.element());
		
		
		//Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(list.peek());
		list.peekFirst();// retrieves but does not remove first
		list.peekLast();// retrieves but does not remove lase
		
		System.out.println(list);
		
		//Retrieve and remove element
		System.out.println("Removed element is "+ list.poll() + "\n\nNow list is " + list);
		//similar are pollfirst and polllast
		
		list.push("ZEro");
		System.out.println(list);
		list.pop();
		System.out.println(list);
		
	}
}
