package sweat.like.pro.five.six;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/resourcesfive")
public class MyResource {
	
	
	/*
	 * Here method support a response as text but we are returning a date object.
	 * This is classic case of MesssageBodyWriterNotFound.
	 * 
	 * So we have added our custom message body writer
	 */
	@GET
	@Path("/date")
	@Produces(MediaType.TEXT_PLAIN)
	public Date test()
	{
		return new Date();
	}
}
