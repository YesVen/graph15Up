package sweat.like.a.pro;

import java.util.ArrayList;
import java.util.List;

public class ListQuestion {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("dnyanesh", 12));
		list.add(new Person("dnyanesh", 12));
		list.add(new Person("dnyanesh", 12));
		list.add(new Person("dnyanesh", 12));
		
		System.out.println(list.contains(new Person("dnyanesh", 12)));
	}
}

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
