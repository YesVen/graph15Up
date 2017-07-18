package like.a.pro.lifecycle1;

public class Line {
	private int centerx;
	
	private int centery;

	public Line() {
		super();
	}
	
	public Line(int x, int y) {
		this.centerx = x;
		this.centery = y;
	}

	public int getCenterx() {
		return centerx;
	}

	public void setCenterx(int centerx) {
		this.centerx = centerx;
	}

	public int getCentery() {
		return centery;
	}

	public void setCentery(int centery) {
		this.centery = centery;
	}

	@Override
	public String toString() {
		return "Line [centerx=" + centerx + ", centery=" + centery + "]";
	}
	
	
	
}
