package like.a.pro.jboss_jersey_version_2.learn;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/MyClass")
public class HelloRESTService {
	
	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response sayhello()
	{
		return Response.ok("Hello REST World").build();
	}
	
	@GET
	@Path("/hello/{username}")
	@Produces(MediaType.TEXT_HTML)
	public Response wishUser(@PathParam("username") @DefaultValue("Unknown User") String username)
	{
		return Response.ok("Hi there " + "<h1 style='color:red'>" +username + "</h1>" + ", Howdy?").build();
	}
	
	@GET
	@Path("training")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMaterial()
	{
		
		RawMaterial RM = new RawMaterial(100, "TEst material", "Vendor", 1000);
		return Response.ok(RM)				
				.header("Access-Control-Allow-Origin", "*")
			      .header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
			      .header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With")
			      .build();
		
	}
		
}
