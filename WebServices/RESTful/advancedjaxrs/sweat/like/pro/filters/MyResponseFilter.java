package sweat.like.pro.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/*
 * This class is very useful when you want to intercept the response that is sent to client
 * 
 *  Here I am adding a header PoweredBY=Dnyanesh to every response
 *  
 *  Note :  This gets executed no matter if request fails or passes(even in case of 404 it executes) 
 */
@Provider
public class MyResponseFilter implements ContainerResponseFilter
{
	@Override
	public void filter(ContainerRequestContext request, ContainerResponseContext response) throws IOException 
	{
		response.getHeaders().add("X-Powered-By", "Dnyanesh");
		
		/*
		 * We can 
		 * 		add cookie
		 * 		check response stream for bad chars
		 * 		set new header
		 * 		get status and manipulate response
		 * 		and hell lot of stuff with this
		 */
		
	}
}
