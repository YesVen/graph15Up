package sweat.like.a.pro.behavioral.observer;

public class Main {
	public static void main(String[] args) {
		Run run = new Run();
		
		
		System.out.println("First Ball of the over.........");
		run.addObserver(new TeamScore());
		run.addObserver(new PlayerScope());
		
		run.addRun(1);
		
		System.out.println("Second ball of the over..........");
		run.addRun(6);
	}
}
