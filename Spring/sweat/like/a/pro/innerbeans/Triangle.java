package like.a.pro.innerbeans;

public class Triangle {
	
	private String type;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Triangle() {
		super();
	}
	
	public Triangle(String type, Point pointA, Point pointB, Point pointC) {
		this.type = type;
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	
	public void draw() {
		System.out.println("Drawing Traingle with points :" + 
					getPointA().getX() + " "  + getPointA().getY());
		System.out.println("Drawing Traingle with points :" + 
				getPointB().getX() + " "  + getPointB().getY());
		System.out.println("Drawing Traingle with points :" + 
				getPointC().getX() + " "  + getPointC().getY());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	
	
}
