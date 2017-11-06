package like.a.pro.applicationevents.dnyanesh;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DrawEventListener implements ApplicationListener<DrawEvent> {
	public void onApplicationEvent(DrawEvent event) {
		System.out.println("I have found an application Event : "+ event);
	}
}
