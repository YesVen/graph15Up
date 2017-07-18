package like.a.pro.templatebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("templatebean.xml");
		
		/*
		 * Spring can auto wire the beans based on member variables.
		 * If names of member variables match exactly with bean ids then spring auto wire them 
		 */
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		
		triangle.draw();
		
	}
}
