package like.a.pro.jboss_jersey_version_2.learn;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RawMaterial
{
	long id;
	String Title;
	String costPaidBy;
	double cost;
	
	public RawMaterial()
	{
		
	}
	
	public RawMaterial(long id,
	String Title,
	String costPaidBy,
	double cost)
	{
		this.id =  id;
		this.Title = Title;
		this.costPaidBy = costPaidBy;
		this.cost = cost;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getCostPaidBy() {
		return costPaidBy;
	}
	public void setCostPaidBy(String costPaidBy) {
		this.costPaidBy = costPaidBy;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
