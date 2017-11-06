package like.a.pro.applicationevents.dnyanesh;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Shape shape = (Shape) context.getBean("circle");
		
		shape.draw();
	}
}
