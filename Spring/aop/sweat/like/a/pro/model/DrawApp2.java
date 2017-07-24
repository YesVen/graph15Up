package sweat.like.a.pro.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sweat.like.a.pro.service.ShapeService;

public class DrawApp2 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/sweat/like/a/pro/config/config.xml");
		
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		System.out.println(shapeService.getCircle().getPoints());
		
		System.out.println(shapeService.getTriangle().getName());
		
		/*
		 * This will call our aspect. 
		 * 
		 * AOP will take care of thing that the aspect must be called only and only when we make an explicit call to 
		 * set method. 
		 * Spring make an implicit call to setter when it initalizes beans. AOP will not call aspect at that time
		 * And this is very important feature : KEEP IN MIND  
		 */
		shapeService.getTriangle().setName("Bermuda");
		
		shapeService.getXYZ();
		
		shapeService.setSomething("Some Text");
	}
}
