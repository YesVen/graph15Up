package sweat.like.a.pro.model;

import java.util.List;


public class Circle implements Shape
{
	private String name;
	
	private List points;
	
	public List getPoints() {
		return points;
	}

	public void setPoints(List<String> points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void draw() {
		System.out.println("Drawing Circle");
	}

	public void reDraw()
	{
		System.out.println("Re-Drawing Circle");
	}
}
