package like.a.pro.annotation.resource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resourceannotation.xml");
		
		context.registerShutdownHook();
		Shape shape1 = (Shape) context.getBean("circle");
		
		shape1.draw();
		
		
	}
}
