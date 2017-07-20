package sweat.like.a.pro.model;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sweat.like.a.pro.service.ShapeService;

public class DrawApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/sweat/like/a/pro/config/config.xml");
		
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		System.out.println(shapeService.getCircle().getPoints());
		
		System.out.println(shapeService.getTriangle().getName());
		
		shapeService.getCircle().setPoints(new ArrayList<String>(1));
		
		shapeService.getCircle().draw();
		
		shapeService.getCircle().reDraw();
	}
}
