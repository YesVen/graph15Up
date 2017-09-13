package sweat.like.a.pro.structural.decorator;

public class PizzaDecorator implements IPizza{

	IPizza pizza;
	
	public PizzaDecorator(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public IPizza prepare() {
		pizza.prepare();
		return pizza;
	}
	
	
	
}
