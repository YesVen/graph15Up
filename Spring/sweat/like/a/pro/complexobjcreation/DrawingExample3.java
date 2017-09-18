package like.a.pro.complexobjcreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("complexobjcreation.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		triangle.draw();
		
		triangle.getPointA().getX();
		
		System.out.println(triangle.getType());
	}
}
