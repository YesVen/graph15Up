package like.a.pro.jboss_jersey_version_2.learn.exception;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("/exception4")
public class WebApplicationExceptionDemo {
	
	@GET
	@Path("/test/{id}")
	public Response test(@PathParam("id") long id)
	{
		if(id > 100)
		{
			/*
			 * We discourage this way of throwing exception over ExceptionMapper
			 * cause 
			 * 		1. we are unnecessarily adding exception code inside business logic,
			 * 			its good idea to keep our non business logic code separated
			 * 		2. It makes our clean code cluttered	
			 */
			throw new WebApplicationException(Response.status(Status.NOT_FOUND)
					.entity("Not found what you are looking for")
					.build());
		}
		
		return Response.ok("Returning response for id less than 100").build();
	}
}
