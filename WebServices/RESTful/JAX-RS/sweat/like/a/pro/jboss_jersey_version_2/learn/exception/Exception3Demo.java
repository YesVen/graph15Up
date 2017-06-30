package like.a.pro.jboss_jersey_version_2.learn.exception;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/exception3")
public class Exception3Demo 
{
	@GET
	@Path("/test/{id}")
	public Response test(@PathParam("id") long id) throws DataNotfoundException
	{
		if(id > 100)
		{
			throw new DataNotfoundException();
		}
		
		return Response.ok("Returning response for id less than 100").build();
	}
}
