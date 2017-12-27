package sweat.like.a.pro.seasonalplan;


public class SeasonalPlan {

	private String name;
	private String id;
	private String target;
	private String margin;
	
	
	public SeasonalPlan() {
		
	}
	
	public SeasonalPlan(String name, String id, String target, String margin) {
		super();
		this.name = name;
		this.id = id;
		this.target = target;
		this.margin = margin;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getMargin() {
		return margin;
	}
	public void setMargin(String margin) {
		this.margin = margin;
	}
	
	
	
}
