package like.a.pro.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		triangle.draw();
		
		System.out.println(triangle.getType());
	}
}
