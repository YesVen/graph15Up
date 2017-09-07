package sweat.like.a.pro.builder.gangoffour;

public class FortunerBuilder extends CarBuilder{
	@Override
	public void addSteering() {
		System.out.println("Adding power steering to Car");
	}

	@Override
	public void addWheels() {
		System.out.println("Adding alloy wheels to Car");
	}

	@Override
	public void addBody() {
		System.out.println("Adding glazing chassis body to Car");
	}
	
	public void drive(){
		System.out.println("It was a luxurious drive");
	}
}
