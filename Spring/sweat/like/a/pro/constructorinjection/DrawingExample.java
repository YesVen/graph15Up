package like.a.pro.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contructorinjection.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		triangle.draw();
		
	}
}
