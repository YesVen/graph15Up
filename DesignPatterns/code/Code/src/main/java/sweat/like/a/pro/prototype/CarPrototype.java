package sweat.like.a.pro.prototype;

public abstract class CarPrototype implements Cloneable{
	
	/*
	 * This is heart of prototype pattern.
	 * Don't allow user to create a new instance by new keyword. But allow it through cloning
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Cloning a Car");
		return super.clone();
	}
}


class Indica extends CarPrototype{
	/*
	 * If want i can override a clone method.
	 */
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Creating a India Car");
		return super.clone();
	}
}

class Polo extends CarPrototype{
	
}


class Baleno extends CarPrototype{
	
}

