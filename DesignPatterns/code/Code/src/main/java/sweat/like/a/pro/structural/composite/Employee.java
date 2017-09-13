package sweat.like.a.pro.structural.composite;

public class Employee implements IEmployee{

	String name;
	double salary;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	public Employee(String name, double salary) {
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	public void printEmployee() {
		System.out.println("\n\n******Printing Employee - "+ this.name+ " ********");
		System.out.println(this.name + "  "+ this.salary);
	}
}
