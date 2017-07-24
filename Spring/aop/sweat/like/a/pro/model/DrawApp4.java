package sweat.like.a.pro.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sweat.like.a.pro.service.ShapeService;

public class DrawApp4 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/sweat/like/a/pro/config/config.xml");
		
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
	
		shapeService.getTriangle().setName("Bermuda");
	
		shapeService.getCircle().setName("Black Hole");
	}
}
	