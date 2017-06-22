package like.a.pro;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
	
	
	
	
}
