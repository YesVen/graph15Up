package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8.lynda.predicate;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		 this.age = age;
		 this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return this.name + " " + this.age;
	}
	
}
