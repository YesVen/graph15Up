package sweat.like.a.pro.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader extends Employee implements IEmployee{
	List<Employee> team;
	
	public TeamLeader(String name, double salary) {
		super(name,salary);
		team = new ArrayList<>();
	}
	
	public boolean addEmployee(Employee e){
		team.add(e);
		return true;
	}
	
	public boolean removeEmployee(Employee e){
		team.remove(e);
		return true;
	}
	
	public List<Employee> getTeamMembers(){
		return this.team;
	}
	
	@Override
	public void printEmployee() {
		super.printEmployee();
		
		System.out.println("Printing All employees of Team ");
		team.forEach(emp -> emp.printEmployee());
	}
	
	
}
