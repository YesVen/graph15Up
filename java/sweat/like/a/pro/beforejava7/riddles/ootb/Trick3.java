package sweat.like.a.pro.beforejava7.riddles.ootb;

import java.io.IOException;

/**
 * 	Overriding : 
 *				For unchecked Exception, overriding and overrrden method can throw any exception.No rules.  
 *				For Checked Exception, overriding method cannot throw exception greater than overriden method.
 *
 *	Overloading : 
 *				No rules at all.
 *
 *
 *	Covariant Return : From java 5 onwards, its not mandatory for method overrrding to have exact return type as that of overriding method.
 *	Return type can be subtype.
 *	If methodA returns Object, I can override it with methodA() but return type will be any subtype of Object 
 */


class Computer
{
	public void start() throws IOException
	{
		
	}
	
	public Object shutdown()
	{
		return null;
	}
	
	
}


class DeskTop extends Computer
{
	public void start() throws Exception
	{
		
	}
	
	/*	From java 5 onwards, its not mandatory for method overrrding to have exact return type as that of overriding method.
	 *	Return type can be subtype.
	 *	If methodA returns Object, I can override it with methodA() but return type will be any subtype of Object
	*/ 
	public Integer shutdown()
	{
		return null;
	}
}
public class Trick3 {

}