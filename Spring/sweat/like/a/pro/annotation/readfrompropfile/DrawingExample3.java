package like.a.pro.annotation.readfrompropfile;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingExample3 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("readfrompropertyfile.xml");
		
		context.registerShutdownHook();
		Shape shape1 = (Shape) context.getBean("circle");
		
		shape1.draw();
		
		//Read prop file
		System.out.println("Prop Entry is : "+ context.getMessage("greeting.message", null , "Property not found", null));
		
		
	}
}
