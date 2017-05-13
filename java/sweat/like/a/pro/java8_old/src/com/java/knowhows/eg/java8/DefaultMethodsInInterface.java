package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8;

//http://stackoverflow.com/questions/18286235/what-is-the-default-implementation-of-method-defined-in-an-interface

interface A
{
	default void click()
	{
		System.out.println("Clicking in A's Way");
	}
	
	
}

interface B
{
	default void click()
	{
		System.out.println("Clicking in B's Way");
	}
}


public class DefaultMethodsInInterface implements A,B
{
	//To avoid compilation error due to diamond problem we have to override click() from A n B
	public void click()
	{
		//To refer to click() in A specifically
		A.super.click();
	}
	
	
	public static void main(String[] args) 
	{
		DefaultMethodsInInterface aa  = new DefaultMethodsInInterface();
		aa.click();
	}

}
