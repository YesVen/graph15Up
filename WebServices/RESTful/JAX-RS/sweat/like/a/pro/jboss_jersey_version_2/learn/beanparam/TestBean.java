package like.a.pro.jboss_jersey_version_2.learn.beanparam;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/testbean")
@Produces(MediaType.APPLICATION_JSON)
public class TestBean 
{
	@POST
	public Test testMe(@BeanParam Test test)
	{
		Test test1 = new Test("dnyaensh", "barkade");
		return test1;
	}
}
