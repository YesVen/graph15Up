package sweat.like.a.pro.builder.gangoffour;

public class Main {
	public static void main(String[] args) {
		
		Car nano = new NanoBuilder().buildCar();
		System.out.println("Nano car created.");
		
		
		Car fortuner = new FortunerBuilder().buildCar();
		System.out.println("Fortuner car created.\n\n");
	}
}
