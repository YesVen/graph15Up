package like.a.pro.jboss_jersey_version_2.learn.HATEOAS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import like.a.pro.jboss_jersey_version_2.learn.RawMaterial;

@Path("/hateoas")
public class HeateoasExample1 {

	@GET
	@Path("/resource1/{rawmaterialId}")
	@Produces(MediaType.APPLICATION_JSON)
	public RawMaterial test(@PathParam("{rawmaterialid}") long rawmaterialId, @Context UriInfo info)
	{
		RawMaterial rm = new RawMaterial(rawmaterialId, "TEst MAterial", "VENDOR", 1000);
		String uri = info.getBaseUriBuilder() // This will return base app uri i.e. http://localhost:8080/enovia/
				.path(HeateoasExample1.class)//This will return class level annotation i.e. /hateoas
				.path(Long.toString(rawmaterialId))// materialid i.e. 1000
				.build()
				.toString();
		
		rm.addLink("self", uri);
		rm.addLink("allrawmaterial", info.getBaseUriBuilder().path(HeateoasExample1.class).path("/rawmaterials").build().toString());
		return rm;
	}
}
