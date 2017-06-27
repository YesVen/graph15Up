package like.a.pro.jboss_jersey_version_2.learn;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("xml")
public class XMLExample1 {
	
	
	/*
	 * http://localhost:8080/RESTful/xml/rawmaterial
	 */
	@GET
	@Path("/rawmaterial")
	public RawMaterial getRawMaterial()
	{
		return new RawMaterial(100, "BF01", "VEndor", 12.5);
	}
}
