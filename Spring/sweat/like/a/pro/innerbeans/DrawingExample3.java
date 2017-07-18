package like.a.pro.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("innerbeans.xml");
		
		/*
		 * WE can create object by using id or name property of bean. see innerbeans.xml
		 * 
		 * Best practice is to use id
		 */
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		
		
		/*
		 * We can creare object ny using alias of the bean also. see innerbeans.xml
		 */
		Triangle triangleObjectByAlias = (Triangle) context.getBean("traingle-alias");
		
		triangle.draw();
		
		triangleObjectByAlias.draw();
		
		System.out.println(triangle.getType());
		
		System.out.println(triangleObjectByAlias.getType());
		
		
	}
}
