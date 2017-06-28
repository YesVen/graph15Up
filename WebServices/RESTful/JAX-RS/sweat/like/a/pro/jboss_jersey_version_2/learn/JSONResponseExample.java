package like.a.pro.jboss_jersey_version_2.learn;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/testbean")
public class JSONResponseExample 
{
	
	@POST
	@Path("test2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String test()
	{
		return "POst Works!";
	}
	
	
	@GET
	@Path("test3")
	@Produces(MediaType.APPLICATION_JSON)
	public Test test3()
	{
		return new Test("A","V");
	}
	
	
	@POST
	@Path("test4")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Test test4(Test testObject)
	{
		return new Test(testObject.getFname(),testObject.getLname());
	}
}
