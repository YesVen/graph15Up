package sweat.like.pro.filters;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/resourcesfilter")
public class MyResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test()
	{
		return "It Works!";
	}
}
