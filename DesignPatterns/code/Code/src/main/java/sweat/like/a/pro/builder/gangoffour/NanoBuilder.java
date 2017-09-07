package sweat.like.a.pro.builder.gangoffour;

public class NanoBuilder extends CarBuilder{

	@Override
	public void addSteering() {
		System.out.println("Adding ordinary steering to Car");
	}

	@Override
	public void addWheels() {
		System.out.println("Adding ordinary wheels to Car");
	}

	@Override
	public void addBody() {
		System.out.println("Adding ordinary chassis body to Car");
	}

	public void drive(){
		System.out.println("It was a hazy drive");
	}
}
