package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.trick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings 
{
	public static void main(String[] args) 
	{
		String q = "This string words has duplicate This words has This";
		
		//Way 1
		String[] splits = q.split(" ");
		Set<String>set = new HashSet<>(Arrays.asList(splits));
		System.out.println(set);
		
		//Way two
		List<String> stream = new ArrayList<String>(Arrays.asList(splits));
		System.out.println(stream.stream().distinct().collect(Collectors.toList()));
		
		//Way three
		String ans = "";
		String myway = "";
		for(int index=0; index < q.length(); index++)
		{
			char character = q.charAt(index);
			
			if(character != ' ')
			{
				myway = myway.concat(String.valueOf(character));
			}
			else
			{
				if(ans.length() == 0)
				{
					ans  = ans + myway;
					myway = "";
				}
				else
				{
					if(! ans.contains(myway))
					{
						ans = ans + " " + myway;
					}
					myway = "";
				}
			}
		}
		
		System.out.println("\n\n\n"+ ans);
		
	}
}
