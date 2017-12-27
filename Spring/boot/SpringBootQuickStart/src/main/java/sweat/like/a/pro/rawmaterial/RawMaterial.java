package sweat.like.a.pro.rawmaterial;

public class RawMaterial {

	private  String id;
	private String name;
	private String desc;
	private String currency;
	
	
	public RawMaterial(){
		
	}
	
	public RawMaterial(String id, String name, String desc, String currency) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.currency = currency;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	
}
