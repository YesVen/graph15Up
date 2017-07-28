package sweat.like.a.pro.model;

import java.util.Date;
import java.util.List;

public class RawMaterial {

	private String name;
	
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
