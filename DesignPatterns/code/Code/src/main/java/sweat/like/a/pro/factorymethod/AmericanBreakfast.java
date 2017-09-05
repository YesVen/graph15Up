package sweat.like.a.pro.factorymethod;

public class AmericanBreakfast extends BreakfastFactory{

	@Override
	public BreakfastItem getItem2() {
		return new Sandwich();
	}

	@Override
	public BreakfastItem getItem3() {
		return new Eggs();
	}

	
}
