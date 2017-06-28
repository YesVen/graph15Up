package like.a.pro.jboss_jersey_version_2.learn.beanparam;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/testbean")
public class TestBean 
{
	@POST
	@Path("test1")
	@Produces(MediaType.APPLICATION_JSON)
	public Test testMe(@BeanParam Test test)
	{
		Test test1 = new Test("dnyaensh", "barkade");
		return test1;
	}
	
	
	@POST
	@Path("test2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String test()
	{
		return "POst Works!";
	}
	
	
	//https://stackoverflow.com/questions/32608535/messagebodywriter-not-found-for-media-type-application-json
	@GET
	@Path("test3")
	@Produces(MediaType.APPLICATION_JSON)
	public Test test3()
	{
		return new Test("A","V");
	}
}
