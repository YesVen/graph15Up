package like.a.pro.annotation.resource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
	
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Called before Destroying bean Circle");
	}
	
	@PostConstruct
	public void constructBean()
	{
		System.out.println("Called after constructing bean Circle");
	}
}
