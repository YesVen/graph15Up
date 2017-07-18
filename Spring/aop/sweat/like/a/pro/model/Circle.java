package sweat.like.a.pro.model;

public class Circle implements Shape
{
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

}
