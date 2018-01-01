package like.a.pro.jboss_jersey_version_2.learn;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;



@Path("/uriinfo")
public class UriInfoExample1 
{
	/*
	 * USe URL : http://localhost:8080/RESTful/uriinfo;name=dnyanesh;empid=102638;name=ashu/test/go?abd=tesy
	 * 
	 * Note use of matrix params here.
	 * 
	 */
	@GET
	@Path("/test1")
	@Produces(MediaType.TEXT_HTML)
	public Response testURIInfo(@Context UriInfo uriInfo)
	{
		System.out.println(uriInfo.toString());
		
		System.out.println(uriInfo.getAbsolutePath());
		
		System.out.println(uriInfo.getBaseUri());
		
		System.out.println(uriInfo.getPath());
		
		System.out.println(uriInfo.getPathSegments());
		
		List<PathSegment> segments = uriInfo.getPathSegments();
		for (PathSegment pathSegment : segments) {
			System.out.println("Pathsegment is " + pathSegment.getPath());
			MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
			System.out.println("Matrix Params for segment "+ pathSegment.getPath()+ " is " + map);
		}
		
		return Response.ok("Test Success").build();
	}
	
	/*
	 * http://localhost:8080/RESTful/uriinfo/test2/go/come/sit
	 */
	@GET
	@Path("test2/{gasdasddadso}/{cosdasdasdme}/{asdasdasd}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testPathParams(@Context UriInfo uriInfo)
	{
		/*
		 * uriInfo.getPathParameters method lists "only embedded" params in path 
		 */
		MultivaluedMap<String, String> map = uriInfo.getPathParameters();
		System.out.println(map);
		
		
		return Response.ok("Test Success").build();
	}
	
	
}
