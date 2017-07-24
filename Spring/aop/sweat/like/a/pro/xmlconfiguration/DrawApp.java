package sweat.like.a.pro.xmlconfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sweat.like.a.pro.service.ShapeService;

public class DrawApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/sweat/like/a/pro/xmlconfiguration/config.xml");
		
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		shapeService.getTriangle().findArea();
		
		System.out.println(shapeService.getTriangle().getHeight());
	}
}
