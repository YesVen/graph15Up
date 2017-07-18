package like.a.pro.innerbeans.idref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("idref.xml");
		
		/*
		 * WE can create object by using id or name property of bean. see innerbeans.xml
		 * 
		 * Best practice is to use id.
		 * 
		 * If we want to add restriction to have only id then we use idref in spring configuration xml
		 * 
		 *  see idref.xml
		 */
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		
		
		triangle.draw();
		
		
	}
}
