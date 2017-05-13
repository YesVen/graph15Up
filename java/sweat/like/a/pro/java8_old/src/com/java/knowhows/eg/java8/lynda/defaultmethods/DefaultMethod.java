package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8.lynda.defaultmethods;

interface DefaultMethodInterface
{
	String getWelcomeMeg();
	
	String getPersonName();
	
	default void sayHi()
	{
		System.out.println(getWelcomeMeg() + " " + getPersonName());
	}
}



public class DefaultMethod implements DefaultMethodInterface 
{
	@Override
	public String getPersonName() 
	{
		return "Dnyanesh";
	}
	
	@Override
	public String getWelcomeMeg() 
	{
		return "Welcome on board,";
	}
	
	public static void main(String[] args) {
		DefaultMethod df = new DefaultMethod();
		df.sayHi();
		
		df.showMe();
	}
	
	public void showMe()
	{
		sayHi();
	}
}
