package sweat.like.pro.three;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

// http://localhost:8080/advancedjaxrs/webapi/resourcesthree/Dnyanesh?wifename=Ashu

@Path("/resourcesthree/{name}")
public class MyResource {
	
	/*
	 * Its pretty much the same like we used to do at method level
	 * 
	 * Extra advantage is that, as these are class member variables, these can be accessed anywhere
	 * 
	 */
	@PathParam("name") String name;
	@QueryParam("wifename") String wname;
	@Context UriInfo info;
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test()
	{
		return "MY name is " + name + " and wife name is " + wname 
				+ " \n\nBase URI is " + info.getAbsolutePath().toString();
	}
}
