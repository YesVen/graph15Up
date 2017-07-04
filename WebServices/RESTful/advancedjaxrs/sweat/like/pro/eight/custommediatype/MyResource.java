package sweat.like.pro.eight.custommediatype;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/resourceseight")
public class MyResource {
	
	
	/*
	 * Here we have created our new response type as text/mycustomtype
	 * 
	 * WE have written a message body writer which knows how to produce a customType object as response.
	 * 
	 * From request we need to pass in Accept header as text/mycustomtype 
	 */
	@GET
	@Path("/customdate")
	@Produces("text/mycustomtype")
	public CustomType test()
	{
		CustomType customType = new CustomType();
		customType.name = "custom Object";
		customType.type = "Custom";
		
		return customType;
	}
}
