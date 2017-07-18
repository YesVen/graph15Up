package like.a.pro.beanpostprocessing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanpostprocessing.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		
		
		triangle.draw();
		
	}
}
