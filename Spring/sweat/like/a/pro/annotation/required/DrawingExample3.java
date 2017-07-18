package like.a.pro.annotation.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("requiredannotation.xml");
		
		/*
		 * This is the crux of spring framework. Here all we need is just pass a bean you need to getbean().
		 */
		Shape shape = (Shape) context.getBean("triangle");
		
		
		Shape shape1 = (Shape) context.getBean("circle");
		
		shape.draw();
		
		shape1.draw();
		
		
	}
}
