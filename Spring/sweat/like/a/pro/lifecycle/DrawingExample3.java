package like.a.pro.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		
		/*
		 * This is required for calling destroy method of triangle bean
		 */
		context.registerShutdownHook();
		
		/*
		 * Spring can auto wire the beans based on member variables.
		 * If names of member variables match exactly with bean ids then spring auto wire them 
		 */
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		
		
		triangle.draw();
		
	}
}
