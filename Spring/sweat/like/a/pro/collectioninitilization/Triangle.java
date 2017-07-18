package like.a.pro.collectioninitilization;

import java.util.List;
import java.util.Map;

public class Triangle {
	
	private String type;
	
	private List<Point> points;
	
	Map<String, String> map;
	
	public Triangle() {
		super();
	}
	
	public void draw() {
		for(Point point : getPoints())
		{
			System.out.println("Point : "+ point.getX() + " "+ point.getY());
		}
		
		System.out.println(map);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	



	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}

		
	
}
