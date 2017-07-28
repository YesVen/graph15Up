package sweat.like.a.pro.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

public class RawMaterial {

	@Size(max=10, min=2, message="name should not be null and its length between 2 and 30 characters")
	private String name;
	
	@Size(max=10, min=2, message="title should not be null and its length between 2 and 30 characters")
	private String title;
	
	private Long id;
	
	private String currency;
	
	private List<String> seasonalLibraries;
	
	private Date creataionDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<String> getSeasonalLibraries() {
		return seasonalLibraries;
	}

	public void setSeasonalLibraries(List<String> seasonalLibraries) {
		this.seasonalLibraries = seasonalLibraries;
	}

	public Date getCreataionDate() {
		return creataionDate;
	}

	public void setCreataionDate(Date creataionDate) {
		this.creataionDate = creataionDate;
	}
	
	
	
}
