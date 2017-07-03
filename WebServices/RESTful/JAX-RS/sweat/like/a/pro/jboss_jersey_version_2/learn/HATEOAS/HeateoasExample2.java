package like.a.pro.jboss_jersey_version_2.learn.HATEOAS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/hateoas2")
public class HeateoasExample2 {

	@GET
	@Path("/resource2/{rawmaterialId}")
	@Produces(MediaType.APPLICATION_JSON)
	public FAORawMaterial test(@PathParam("{rawmaterialid}") long rawmaterialId, @Context UriInfo info)
	{
		FAORawMaterial rm = new FAORawMaterial(rawmaterialId, "TEst MAterial", "VENDOR", 1000);
		String uri = info.getBaseUriBuilder() // This will return base app uri i.e. http://localhost:8080/enovia/
				.path(HeateoasExample1.class)//This will return class level annotation i.e. /hateoas
				.path(Long.toString(rawmaterialId))// materialid i.e. 1000
				.build()
				.toString();
		
		rm.addLink("self", uri);
		return rm;
	}
}
