package like.a.pro.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape
{
	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawig Circle with point "+  getCenter().getX() + ", " + getCenter().getY() );
		
	}

	public Point getCenter() {
		return center;
	}

	
	/*
	 * By default the autowiring type is ByType.
	 * If there are multiple beans of same type in xml then it will look for a bean with same name as that of member property.
	 * If it finds it assigns the bean to the setter.
	 * 
	 * If it dont it throws initisation error
	 *  
	 * It also force the required annotation on same setter. We can make it false by below
	 * @Autowired(required=false)
	 */
	@Autowired
	@Qualifier("circleRelatedBean")
	public void setCenter(Point center) {
		this.center = center;
	}
}
