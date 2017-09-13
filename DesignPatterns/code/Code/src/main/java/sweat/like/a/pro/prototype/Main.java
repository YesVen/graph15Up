package sweat.like.a.pro.prototype;

public class Main {
	public static void main(String[] args) throws Exception {
		CarPrototype car1 = CarFactory.getCar("Baleno");
		System.out.println("Hashcode : " + car1.hashCode());
		
		CarPrototype car2 = CarFactory.getCar("Baleno");
		System.out.println("Hashcode : " + car2.hashCode());
		
		CarPrototype car3 = CarFactory.getCar("Baleno");
		System.out.println("Hashcode : " + car3.hashCode());
		
		/****************************************************/
		
		
		CarPrototype car4 = CarFactory.getCar("Indica");
		System.out.println("Hashcode : " + car4.hashCode());
		
		/*
		 * This we should not do.
		 * This we should some how restrict programmatically
		 */
		CarPrototype carss = new Baleno();
		
		
		
	}
}
