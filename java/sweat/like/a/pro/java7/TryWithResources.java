package sweat.like.a.pro.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * This is for resource management.
 * Many times we use resource and forget to give them back.
 * e.g. Opening a file and not closing.
 * 
 * Trywith Resources  allows us to auto close/give up resources when not needed.
 */
public class TryWithResources {
	public static void main(String[] args) {
		
		//We can pass anything that implements autoClosable/closable interface.
		try(BufferedReader br=new BufferedReader(new FileReader("d:\\myfile.txt")))
		{
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			
			// br.close(); --> This is auto handled
		}
		catch(IOException ie)
		{
			System.out.println("exception"); 
		}
	}
}
