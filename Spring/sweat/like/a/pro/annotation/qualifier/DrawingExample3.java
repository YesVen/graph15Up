package like.a.pro.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("qualifierannotation.xml");
		
		Shape shape1 = (Shape) context.getBean("circle");
		
		shape1.draw();
		
		
	}
}
