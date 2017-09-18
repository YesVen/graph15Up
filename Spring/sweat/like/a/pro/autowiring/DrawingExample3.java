package like.a.pro.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("wiring.xml");
		
		/*
		 * Spring can auto wire the beans based on member variables.
		 * If names of member variables match exactly with bean ids then spring auto wire them 
		 */
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		
		
		triangle.draw();
		
		/**
		 * This proves that triangle object returned by spring container is singleton
		 * 
		 * default scope is singleton
		 */
		triangle.setPointA(new Point(100, 100));
		Triangle newTriangle = (Triangle) context.getBean("triangle-name");
		newTriangle.draw();
		
		
		
	}
}
