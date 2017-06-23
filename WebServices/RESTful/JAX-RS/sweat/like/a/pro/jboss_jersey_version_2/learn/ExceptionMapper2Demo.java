package like.a.pro.jboss_jersey_version_2.learn;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;



@Path("/exception")
public class ExceptionMapper2Demo
{
	@Path("/mapper1")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response test1(@MatrixParam("testdata") String testdata ) throws ExceptionMapper2
	{
		if(testdata == null)
		{
			/*
			 * This will take default status and error message and show response to user
			 */
			throw new ExceptionMapper2();
		}
		
		return Response.ok("Hi there " + testdata).build();
	}
	
	
	@Path("/mapper2")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response test2(@MatrixParam("testdata") String testdata )throws ExceptionMapper2
	{
		if("NullPointerException".equals(testdata))
		{
			/*
			 * This will make use of constructor which can set mediatype of response
			 */
			throw new ExceptionMapper2("Severe NullpointerException is happening. Please try again", MediaType.TEXT_PLAIN);
		}
		
		return Response.ok("Hi there " + testdata).build();
	}
	
	
	
	@Path("/mapper3")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response test3(@MatrixParam("testdata") String testdata )throws ExceptionMapper2
	{
		if("Forbidden".equals(testdata))
		{
			/*
			 * This will make use of constructor which can set mediatype and of response
			 */
			throw new ExceptionMapper2("ForBidden thing cannot be accessed. Never try this thing again.", MediaType.TEXT_PLAIN, Status.FORBIDDEN);
		}
		
		return Response.ok("Hi there " + testdata).build();
	}
	
}