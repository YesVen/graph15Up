package like.a.pro.setterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingExample1 {
	public static void main(String[] args) {
		
		
		//Triangle triangle = new Triangle();
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("sweat/like/a/pro/setterinjection/spring.xml"));
		Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		triangle.draw();
	}
}
