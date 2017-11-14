package sweat.like.a.pro.beforejava7.riddles.ootb;

import java.util.ArrayList;
import java.util.List;


class Vehicle
{
	public void run()
	{
		System.out.println("vehicle running");
	}
}

class LandVehicle extends Vehicle
{
	public void run()
	{
		System.out.println("LandVehicle running");
	}
}


class TwoWheeler extends LandVehicle
{
	public void run()
	{
		System.out.println("TwoWheeler running");
	}
}

public class Trick1 {

	public static void main(String[] args) {
		
		Vehicle v = new TwoWheeler();
		v.run();//It will call run  method from TwoWheeler
		
		List<String> list = new ArrayList<>();
		list.add("AA");// It will call add method from ArrayList
		
		TwoWheeler t = (TwoWheeler) new Vehicle(); //Runtime ClassCastException
		
		t.run();
	}

}
