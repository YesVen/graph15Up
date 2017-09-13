package sweat.like.a.pro.prototype;

import java.util.HashMap;
import java.util.Map;


public class CarFactory {
	static Map<String, CarPrototype> cars = new HashMap<String, CarPrototype>();
	
	CarFactory(){
		System.err.println("Dont create Factory object");
	}
	
	/*
	 * Nothing fancy here. Just creating car objects to be used after
	 * We are creating prototypes of Cars here and we are not allowing user to create car using new keyword.
	 * Instead user should use getCar method.
	 */
	static{
		cars.put("Indica", new Indica());
		cars.put("Polo", new Polo());
		cars.put("Baleno", new Baleno());
	}
	
	
	public static CarPrototype getCar(String type) throws CloneNotSupportedException{
		CarPrototype car = (CarPrototype)cars.get(type);
		return (CarPrototype)car.clone();
	}
	
}
