package like.a.pro.jboss_jersey_version_2.learn.subresources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/messages")
public class MessageService {
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getMessage(@PathParam("messageId") int messageId)
	{
		return Response.ok("Message " + messageId + " retrieved").build();
	}

	
	/**
	 * Note we dont provide any GET/POST here
	 * 
	 * We want to delegate the the authority to sub resource.
	 * All request come to comments should go to a new service CommentService
	 * 
	 * Just Divert the traffic to a sub resource
	 */
	@Path("/{messageId}/comments")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public CommentsService getMessageComments()
	{
		System.out.println("Calling subresources....");
		return new CommentsService();
	}
}
