package like.a.pro.jboss_jersey_version_2.learn.beanparam;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FAORawMaterial {

	@PathParam("name")
	private String name;
	
	@PathParam("type")
	private String type;
	
	@PathParam("revision")
	private String revision;
	
	@HeaderParam("Content-Type")
	 String contentType;
	
	FAORawMaterial()
	{
		super();
	}

	public FAORawMaterial(String name, String type, String revision, String contentType) {
		super();
		this.name = name;
		this.type = type;
		this.revision = revision;
		this.contentType = contentType;
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

	public String getContentType() {
		return contentType;
	}

	
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Override
	public String toString() {
		return "FAORawMaterial [name=" + name + ", type=" + type
				+ ", revision=" + revision + ", contentType=" + contentType
				+ "]";
	}
	
	
}
