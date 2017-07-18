package like.a.pro.annotation.readfrompropfile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shape
{
	private Point center;
	
	private MessageSource messageSource;
	
	@Override
	public void draw() {
		System.out.println("Drawig Circle with point "+  getCenter().getX() + ", " + getCenter().getY() );
	
		System.out.println("Beautiful : " + this.messageSource.getMessage("circle.mesg1",
				new Object[]{ center.getX(), center.getY()},
				"Property not found",
				null));
		
		System.out.println("Reading property from bean : " + this.messageSource.getMessage("greeting.message", null , "Property not found", null));
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

	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	
}
