package sweat.like.a.pro.beforejava7.riddles;
/*
 * Can we call main manually from some other method
 */
public class MainDemo {
	public static void main(String[] args) {
		System.out.println("Main Called");
	}
	
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
