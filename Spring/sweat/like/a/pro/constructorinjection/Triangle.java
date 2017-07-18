package like.a.pro.constructorinjection;

public class Triangle {
	
	private String type;
	private int height;
	
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public void draw() { 
		System.out.println("Drawing Traingle of type " + this.type + "of height " + getHeight());
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}

	/*
	 * Commenting out setter as we are using constructor injection
	 */
	/*public void setType(String type) {
		this.type = type;
	}*/
}
