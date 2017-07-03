package sweat.like.pro.four;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

//http://localhost:8080/advancedjaxrs/webapi/resourcesfour/today

//http://localhost:8080/advancedjaxrs/webapi/resourcesfour/tomorrow

//http://localhost:8080/advancedjaxrs/webapi/resourcesfour/yesterday

@Path("/resourcesfour")
public class MyResource {
	
	
	
	@GET
	@Path("/{when}")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("when") MyDate date )
	{
		return "Date is " + date;
	}
}
