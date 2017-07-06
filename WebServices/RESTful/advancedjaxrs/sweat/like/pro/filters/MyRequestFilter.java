package sweat.like.pro.filters;

import java.io.IOException;
import java.util.Map;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

/*
 * Code is self explanatory
 */
@Provider
public class MyRequestFilter implements ContainerRequestFilter
{
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException 
	{
		System.out.println("Headers are : " + requestContext.getHeaders());
		
		/*
		 * From postman add Set-Cookie header to your get request
		 */
		
		Map<String, Cookie> cookies = requestContext.getCookies();
		Cookie cookie = cookies.get("JSESSIONID");
		if(!cookie.getValue().equals("ValidCookieId"))
		{
			requestContext.abortWith(Response.status(Status.UNAUTHORIZED)
					.entity("Aborting Request as valid cookie not found.")
					.build());
		}
	}
}
