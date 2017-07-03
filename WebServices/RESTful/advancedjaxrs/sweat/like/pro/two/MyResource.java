package sweat.like.pro.two;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/resourcestwo")
/*
 * This annotation tells jersey that this resource has to be initialized only once
 * (By default jersey initiates the resource on each request)
 * So this resource will be initialized only once during server start
 */
@Singleton
public class MyResource {
	
	private int count = 0;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test()
	{
		count ++;
		return "It Works " + count + " times";
	}
}
