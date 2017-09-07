package sweat.like.a.pro.builder.gangoffour;

public abstract class CarBuilder {

	public abstract void addSteering();
	public abstract void addWheels();
	public abstract void addBody();
	
	public Car buildCar(){
		addSteering();
		addBody();
		addWheels();
		return new Car(this);
	}
}
