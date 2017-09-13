package sweat.like.a.pro.structural.composite;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager("Yjl",150000);
		
		TeamLeader teamlead1 = new TeamLeader("Dnyanesh",50000);
		
		TeamLeader teamlead2 = new TeamLeader("Harshal",80000);
		
		teamlead1.addEmployee(new Employee("A",10000));
		
		
		teamlead2.addEmployee(new Employee("B",20000));
		teamlead2.addEmployee(new Employee("C",20000));
		
		manager.addTeam(teamlead1.getTeamMembers());
		manager.addTeam(teamlead2.getTeamMembers());
		
		manager.printEmployee();
	}
}
