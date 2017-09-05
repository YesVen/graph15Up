package sweat.like.a.pro.factorymethod;

public class Main {
	public static void main(String[] args) {
		IndianBreakfast indian = new IndianBreakfast();
		System.out.println("Indian breakfast created with "+ indian.item1.getClass().getSimpleName()+","+
				indian.item2.getClass().getSimpleName()+ ","+ indian.item3.getClass().getSimpleName());
		
		
		
		AmericanBreakfast american = new AmericanBreakfast();
		System.out.println("American breakfast created with "+ american.item1.getClass().getSimpleName()+","+
				american.item2.getClass().getSimpleName()+ ","+ american.item3.getClass().getSimpleName());
		
	}
}
