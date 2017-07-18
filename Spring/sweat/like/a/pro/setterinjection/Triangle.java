package like.a.pro.setterinjection;

public class Triangle {
	
	private String type;
	
	public void draw() {
		System.out.println("Drawing Traingle");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
