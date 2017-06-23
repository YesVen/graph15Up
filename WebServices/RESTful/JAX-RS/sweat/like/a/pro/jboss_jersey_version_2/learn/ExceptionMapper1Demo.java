package like.a.pro.jboss_jersey_version_2.learn;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/except")
public class ExceptionMapper1Demo
{
	@Path("/nullpointer")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response test(@MatrixParam("testdata") String testdata ) throws ExceptionMapper1
	{
		throw new ExceptionMapper1();
		
	}
}