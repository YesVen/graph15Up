package sweat.like.a.pro.java8_old.src.com.java.designpatterns.creational.singleton;

public class UseSingleTon
{
	public static void main(String args[])
	{
		Singleton ss = Singleton.getInstance();
		
		ss.sayHello();
		
		
	}
}


class Singleton 
{
	private static Singleton singleton;
	private Singleton(){
		
	}
		
	public static Singleton getInstance()
	{
		if(singleton == null)
		{	
			singleton = new Singleton();
			return singleton;
		}
		return null;
	}
	
	public void sayHello()
	{
		System.out.println("Hello Singleton");
	}
}
