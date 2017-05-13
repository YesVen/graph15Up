package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8.lynda;

public class USeSimpleInterface {

	public static void main(String[] args) {
		
		SimpleInterface obj = () -> System.out.println("Hello lambda");
		obj.sayHello();
		
	}

}
