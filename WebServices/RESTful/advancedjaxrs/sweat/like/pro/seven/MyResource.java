package sweat.like.pro.seven;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/resourcesseven")
public class MyResource {
	
	
	/*
	 * 
	 */
	@POST
	@Path("/date")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String test(Date d)
	{
		return d.toString();
	}
}
