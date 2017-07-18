package like.a.pro.lifecycle1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private Line line;
	
	public Triangle() {
		super();
	}
	
	public void draw() {
		
		System.out.println(getPointA());
		System.out.println(getPointB());
		System.out.println(getPointC());
		
		System.out.println(getLine());
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Properties of bean triangle set. Init Done");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying bean triangle");
		
	}
	
	public void myStartUpCode() throws Exception {
		System.out.println("********** bean set up code");
		
	}
	
	public void myCleanUp() throws Exception {
		System.out.println("********** cleaning up bean triangle");
		
	}
}
