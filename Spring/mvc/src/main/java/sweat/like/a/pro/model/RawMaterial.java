package sweat.like.a.pro.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

import sweat.like.a.pro.annotations.IsValidName;


@JsonPropertyOrder(alphabetic=true) // This will make alphabetical sequence of attributes in this bean while sending response
@JsonIgnoreProperties(value={"id"})//This will skip id prop from response
@JsonInclude(value=Include.NON_NULL)//This will make those attributes to be part of response which are not null
public class RawMaterial {

	/*
	 * Validation is not working for this field because it has custom property editor
	 */
	@Size(max=10, min=2, message="Name of the material should be between 2 and 10 characters")
	@JsonProperty(value="raw_material_name",required=true) // This will change this prop name in response to raw_material_name
	private String rawMaterialName;
	

	/*
	 * Validation string has been externalised to properties file
	 */
	@IsValidName(forbiddenWords="MQL|delete|Test Everything|trigger on|push context",
					message="Title Cannot have forbidden words")//custom validation
	@Size(max=10,min=4)
	private String title;
	
	@Pattern(regexp="^[a-z0-9]*$", message="invalid vednor. Only lowercase a-z 0-9 allowed.")
	private String vendor;
	
	private String modelNumber;
	
	@Digits(integer=1, fraction = 0, message="Maximum 10 digits allowed for Id")
	private Long id;
	
	private String currency;
	
	@NotNull(message="Seasonal Libraries cannot be null")
	private List<String> seasonalLibraries;
	
	/*
	 * Value binded to this variable must be from past wrt current date
	 * similarly @future works
	 */
	@Past
	private Date creataionDate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public String getRawMaterialName() {
		return rawMaterialName;
	}
	
	public void setRawMaterialName(String rawMaterialName) {
		this.rawMaterialName = rawMaterialName;
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

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	
	
}
