package sweat.like.a.pro.beforejava7.riddles;
/*
 * Can we call main manually from some other method
 * 
 * There is no point returning anything to JVM so void is return type
 */
public class MainDemo {
	public static void main(String[] args) {
		System.out.println("Main Called");
	}
	
	/*
	 * Overloaded main method
	 */
	public static void main(){
		System.out.println("We can overload main method");
	}
}

class TestSZ{
	public static void main(String[] args) {
		/*
		 * This is good learning
		 */
		MainDemo.main(null);
	}
}
