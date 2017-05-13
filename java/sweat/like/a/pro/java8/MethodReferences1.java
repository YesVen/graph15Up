package sweat.like.a.pro.java8;

public class MethodReferences1 {
	public static void main(String[] args) {
		
		//This is lambda way
		Thread t1 = new Thread(()-> printMsg());
		t1.start();
		
		//This is method refrences way
		Thread t2 = new Thread(MethodReferences1 :: printMsg);
		t2.start();
		
		MethodReferences1 obj = new MethodReferences1();
		Thread t3 = new Thread(obj :: printMessageThroughObjectInstace);
		t3.start();
		
		Thread t4 = new Thread(System.out::println);
		t4.start();
	}
	
	
	public static void printMsg()
	{
		System.out.println("HEllo");
	}
	
	public void printMessageThroughObjectInstace()
	{
		System.out.println("Hello from instace method");
	}
	
	public static void printMsg2(String s)
	{
		System.out.println("Hellow from a method that accepts a paramter is "+ s);
	}
	
	
}
