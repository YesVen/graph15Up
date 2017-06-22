package like.a.pro;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/AdvancedHello")
public class AdvancedRESTHello {

	@GET
	@Path("/hello/{username}")
	@Produces(MediaType.TEXT_HTML)
	public Response wishUser(@PathParam("username") @DefaultValue("Unknown User") String username)
	{
		return Response.ok("Hi there " + username + ", Howdy?").build();
	}
}
