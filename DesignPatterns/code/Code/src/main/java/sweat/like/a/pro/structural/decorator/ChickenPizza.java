package sweat.like.a.pro.structural.decorator;

public class ChickenPizza extends PizzaDecorator{

	public ChickenPizza(IPizza pizza) {
		super(pizza);
	}
	
	@Override
	public IPizza prepare() {
		super.prepare();
		System.out.println("Adding chicken topings to pizza..");
		return this;
	}
}
