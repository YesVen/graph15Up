package sweat.like.a.pro.service;

import sweat.like.a.pro.aspect.annotation.MyLoggableAspect;
import sweat.like.a.pro.model.Circle;
import sweat.like.a.pro.model.Triangle;

public class ShapeService {
	private Circle circle;
	
	private Triangle triangle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	public void test() {
		
		System.out.println("Testing");
		
	}
	
	
	public void getXYZ()
	{
		System.out.println("Get XYZ called");	
	}
	
	
	public void setSomething(String someText)
	{
		throw new RuntimeException();
	}
	
	public String setSomethingAndReturn(String someText)
	{
		return someText + this.getClass().getSimpleName()
				;
	}
	
	@MyLoggableAspect
	public void doSomething()
	{
		System.out.println("Doing Something");
	}
	
}
