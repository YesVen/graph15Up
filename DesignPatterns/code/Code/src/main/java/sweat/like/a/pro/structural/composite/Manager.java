package sweat.like.a.pro.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends TeamLeader implements IEmployee {

	List<Employee> employees;
	
	public Manager(String name, double salary) {
		super(name,salary);
		employees = new ArrayList<>();
	}
	
	/*
	 * Manager plays team leader role be default so it extends team leader
	 * In addition, he has some more roles
	 */
	
	public void assesEmployee(Employee e){
		System.out.println("Assesing Employee for appraisal");
	}
	
	public void addTeam(List<Employee> team){
		employees.addAll(team);
	}
	
	@Override
	public void printEmployee() {
		super.printEmployee();
		
		System.out.println("Printing All employees under Manager ");
		employees.forEach(emp -> emp.printEmployee());
	}
}
