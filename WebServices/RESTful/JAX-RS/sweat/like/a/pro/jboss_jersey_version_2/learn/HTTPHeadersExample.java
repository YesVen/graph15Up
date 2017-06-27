package like.a.pro.jboss_jersey_version_2.learn;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/headers")
public class HTTPHeadersExample 
{

	@GET
	@Path("test1")
	@Produces(MediaType.TEXT_HTML)
	public Response testHeaders(@Context HttpHeaders headers)
	{
		Map<String, Cookie> cookies = headers.getCookies();
		
		System.out.println(headers.getMediaType());
		return Response.ok("COOKIES = " + cookies).build();
	}
}
