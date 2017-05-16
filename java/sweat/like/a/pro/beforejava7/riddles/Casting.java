package sweat.like.a.pro.beforejava7.riddles;
	
public class Casting {
	public static void main(String[] args) {
		Casting castObj = new Casting();
		
		Object o = Object.class.cast(castObj);
		
		Thread t1 = new Thread();
		
		Runnable r1 = Runnable.class.cast(t1);
	}
}
