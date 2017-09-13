package sweat.like.a.pro.structural.decorator;

public class BasicPizza implements IPizza{

	@Override
	public IPizza prepare() {
		System.out.println("Praparing Pizza");
		return this;
	}

}

