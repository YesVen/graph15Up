package sweat.like.a.pro.factorymethod;

public class IndianBreakfast extends BreakfastFactory{

	@Override
	public BreakfastItem getItem2() {
		return new Tea();
	}

	@Override
	public BreakfastItem getItem3() {
		return new Poha();
	}

	
}
