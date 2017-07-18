package like.a.pro.interfaceexample;

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

	public void setCenter(Point center) {
		this.center = center;
	}
}
