package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.java8;

public class NewExceptionHandling 
{
	public static void main(String[] args) 
	{
		try 
		{
			//try code goes here 
		} 
		catch (NullPointerException | ArrayIndexOutOfBoundsException | ClassCastException ex) 
		{
			ex.printStackTrace();
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}
