package sweat.like.a.pro.structural.decorator;

public class Main {
	public static void main(String[] args) {
		IPizza pizza1 = new ChickenPizza(new BasicPizza());
		
		pizza1.prepare();
	}
}
