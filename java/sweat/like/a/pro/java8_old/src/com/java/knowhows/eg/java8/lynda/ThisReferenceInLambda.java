package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8.lynda;

import java.util.function.Consumer;

public class ThisReferenceInLambda {
	public static void main(String[] args) {
		
		Person p1 = new Person("dnyanesh", 28);
		
		Consumer<Person> con = obj -> System.out.println(obj);
		 
		p1.doSomething(con);
	}
}

class Person{
	String name;
	int age;
	
	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public void doSomething(Consumer<Person> con)
	{
		System.out.println(this);
		System.out.println(con);
	}
	
	public String toString()
	{
		return this.name + " " + this.age; 
	}
}