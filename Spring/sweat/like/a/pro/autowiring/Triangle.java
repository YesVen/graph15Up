package like.a.pro.autowiring;

public class Triangle {
	
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

	
}
