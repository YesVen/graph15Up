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
	
	public FAOProduct() {
		super();
	}
	
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

	@QueryParam("name")
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	@QueryParam("type")
	public void setType(String type) {
		this.type = type;
	}

	public String getRevision() {
		return revision;
	}

	@QueryParam("revision")
	public void setRevision(String revision) {
		this.revision = revision;
	}

	public double getCost() {
		return cost;
	}

	@QueryParam("cost")
	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getCostPaidBy() {
		return costPaidBy;
	}

	@QueryParam("costPaidBy")
	public void setCostPaidBy(String costPaidBy) {
		this.costPaidBy = costPaidBy;
	}

	@Override
	public String toString() {
		return "FAOProduct [name=" + name + ", type=" + type + ", revision="
				+ revision + ", cost=" + cost + ", costPaidBy=" + costPaidBy
				+ "]";
	}
	
		
}
