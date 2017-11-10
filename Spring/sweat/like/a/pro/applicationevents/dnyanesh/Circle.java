package like.a.pro.applicationevents.dnyanesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Circle implements Shape, ApplicationEventPublisherAware
{

	private Point center;
	
	private ApplicationEventPublisher publisher;
	
	public void draw() {
		System.out.println("Drawing a circle with point : "+ this.center.getX() + ","+ this.center.getY());
		
		System.out.println("Publishing a draw event now...");
		publisher.publishEvent(new DrawEvent(this));
	}

	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier(value="centerbean")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
}
