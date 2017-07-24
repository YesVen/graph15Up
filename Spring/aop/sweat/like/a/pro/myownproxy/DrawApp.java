package sweat.like.a.pro.myownproxy;

public class DrawApp {
	public static void main(String[] args) {
		
		/*
		 * AOP runs on a concept of proxy.
		 * 
		 * What it internally does is create a proxy for all the classes.
		 * 
		 * When we write an annotation for aop it just injects that logger lines just before or after
		 * calling the actual method.
		 * 
		 * See ComputerProxy class
		 */
		
		Computer computer = (Computer)MyBeanFactory.getBean("computer");
		
		/*
		 * Here we might think that we have got Computer Object but see line no 6 in MyBeanFactory,
		 * 			if(name.equals("computer")) return new ComputerProxy();
		 * It actually returns a proxy object.
		 */
		computer.start();
		
	}
}
