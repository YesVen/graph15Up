package like.a.pro.collectioninitilization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		
		
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		
		
		triangle.draw();
		
		
	}
}
