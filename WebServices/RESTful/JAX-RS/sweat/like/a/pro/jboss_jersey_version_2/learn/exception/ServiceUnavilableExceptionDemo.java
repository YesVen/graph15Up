package like.a.pro.jboss_jersey_version_2.learn.exception;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/exceptionsssss")
public class ServiceUnavilableExceptionDemo {

	@GET
	@Path("/test/{id}")
	public Response test(@PathParam("id") long id)
	{
		if(id > 100)
		{
			throw new ServiceUnavailableException(Response.status(Status.SERVICE_UNAVAILABLE)
					.entity("Requested Service is not availabel now. Pleae try again")
					.build());
		}
		
		return Response.ok("Returning response for id less than 100").build();
	}
	
	@GET
	@Path("/test1222/{id}")
	public Response test1(@PathParam("id") long id)
	{
		if(id > 100)
		{
			throw new ServerErrorException(Response.status(Status.SERVICE_UNAVAILABLE)
					.entity("Requested Service is not availabel now. Pleae try again")
					.build());
		}
		
		return Response.ok("Returning response for id less than 100").build();
	}
}
