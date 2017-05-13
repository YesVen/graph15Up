package sweat.like.a.pro.java8;

public class DefualtMethod1 {
	public static void main(String[] args) {
		Hero amir = new Hero();
		amir.makeComedy(); // makeComedy default method will get inherited just like any other method of interface
		//But implementing class is not forced to implememt it as it id already implemented inside interface
	}
}


interface Actor
{
	public void act();
	
	default public void makeComedy()
	{
		System.out.println("Every actro needs to make ppl laugh");
	}
}

class Hero implements Actor
{
	public void act()
	{
		System.out.println("A hero acts like a Hero");
	}
}


class Villian implements Actor
{
	public void act()
	{
		System.out.println("A Villian acts like a monster");	
	}
}

