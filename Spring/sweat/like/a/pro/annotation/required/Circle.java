package like.a.pro.annotation.required;

import org.springframework.beans.factory.annotation.Required;

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

	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
}
