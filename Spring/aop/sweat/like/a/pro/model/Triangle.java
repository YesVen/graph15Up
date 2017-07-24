package sweat.like.a.pro.model;

public class Triangle implements Shape
{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void draw() {
		System.out.println("Drawing Triangle");
	}

	public void findArea()
	{
		System.out.println("triangle area is 100sqcm");
	}
	
	public String getHeight()
	{
		return "Triangle height is 10 cm";
	}
	
}
