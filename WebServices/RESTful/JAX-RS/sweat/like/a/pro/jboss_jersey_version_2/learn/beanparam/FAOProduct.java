package like.a.pro.jboss_jersey_version_2.learn.beanparam;

import javax.ws.rs.QueryParam;


public class FAOProduct {
	
	
	@QueryParam("name")
	private String name;
	
	@QueryParam("type")
	private String type;
	
	@QueryParam("revision")
	private String revision;
	
	@QueryParam("cost")
	private double cost;
	
	@QueryParam("costPaidBy")
	private String costPaidBy;
	
	public FAOProduct() {}
	
	public FAOProduct(String name,String type,String revision,double cost,String costPaidBy)
	{
		this.name = name;
		this.type = type;
		this.revision = revision;
		this.cost = cost;
		this.costPaidBy = costPaidBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getCostPaidBy() {
		return costPaidBy;
	}

	public void setCostPaidBy(String costPaidBy) {
		this.costPaidBy = costPaidBy;
	}
	
		
}
