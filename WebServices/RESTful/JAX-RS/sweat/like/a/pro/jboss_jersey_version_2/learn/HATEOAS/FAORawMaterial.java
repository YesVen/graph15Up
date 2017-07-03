package like.a.pro.jboss_jersey_version_2.learn.HATEOAS;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FAORawMaterial
{
	long id;
	String Title;
	String costPaidBy;
	double cost;
	
	//added for hateoas
	List<Link>links;
	
	public FAORawMaterial()
	{
		
	}
	
	public FAORawMaterial(long id,
	String Title,
	String costPaidBy,
	
	double cost)
	{
		this.id =  id;
		this.Title = Title;
		this.costPaidBy = costPaidBy;
		this.cost = cost;
		
		this.links = new ArrayList<>(5); 
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

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLink(String rel, String uri)
	{
		links.add(Link.fromPath(uri).rel(rel).build());
	}
}
