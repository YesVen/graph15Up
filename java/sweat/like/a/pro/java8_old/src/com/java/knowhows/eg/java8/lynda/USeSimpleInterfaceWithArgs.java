package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8.lynda;

public class USeSimpleInterfaceWithArgs {

	public static void main(String[] args) {
		
		SimpleInterfaceWithArgs obj = (name) -> System.out.println("Hello "+ name);
		obj.sayHello("Dnyanesh");
		
	}

}
