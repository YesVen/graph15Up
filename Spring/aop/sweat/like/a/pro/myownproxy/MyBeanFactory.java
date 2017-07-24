package sweat.like.a.pro.myownproxy;

public class MyBeanFactory {
	public static Object getBean(String name){
		Object returnObject = null;
		/*
		 * Dont return actual object, return a proxy
		 */
		if(name.equals("computer")) return new ComputerProxy();
		
		if(name.equals("mouse")) return new Mouse();
		
		return returnObject;
	}
}
