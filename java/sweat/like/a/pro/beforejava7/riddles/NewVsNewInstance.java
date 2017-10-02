package sweat.like.a.pro.beforejava7.riddles;

/**
 *	new operation is used when you know which class you are going to instantiate.
 *
 *  But if user is passing the classname then you don't know which class is going to come
 *  e.g. Servlet container dont know which servlet will be requested by client
 *  
 *  Note the checked exceptions need to be handled  
 */


public class NewVsNewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Me me = new Me();
		
		String className = args[0];
		
		Class obj  = Class.forName(className);
		
		/*
		 * See migration code
		 */
		You you = (You)obj.newInstance();
		
		System.out.println(you);
		
		
	}

}

class Me {
	
}

class You
{
	
}