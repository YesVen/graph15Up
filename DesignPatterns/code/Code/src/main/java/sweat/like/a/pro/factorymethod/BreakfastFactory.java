package sweat.like.a.pro.factorymethod;

public abstract class BreakfastFactory {

	BreakfastItem item1;
	BreakfastItem item2;
	BreakfastItem item3;
	
	public BreakfastFactory() {
		//Not necessary it should be in a constructor
		this.item1 = new Water();
		this.item2 = getItem2();
		this.item3 = getItem3();
	}

	/*
	 * Super class deferring instantiation of Items. 
	 * Instantiation is delegated to subclasses 
	 */
	public abstract BreakfastItem getItem2();
	
	public abstract BreakfastItem getItem3();
}

class BreakfastItem{}

class Tea extends BreakfastItem {}

class Sandwich extends BreakfastItem {}

class Eggs extends BreakfastItem {}

class Poha extends BreakfastItem {}

class Water extends BreakfastItem {}