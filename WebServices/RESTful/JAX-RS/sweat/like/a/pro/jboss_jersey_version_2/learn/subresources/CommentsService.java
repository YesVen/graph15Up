package like.a.pro.jboss_jersey_version_2.learn.subresources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class CommentsService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getMessageComments(@PathParam("messageId") int msgId)
	{
		return Response.ok("retrieving all comments asscociated with " + msgId  ).build(); 
	}
	
	@GET
	@Path("/{commentId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getCommentOfMessage(@PathParam("messageId") int msgId, @PathParam("commentId") String commentId)
	{
		return Response.ok("retrieving comment " + commentId +" asscociated with " + msgId ).build();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createComment(@PathParam("messageId") int msgId)
	{
		return Response.ok("Creating a comment on message " + msgId ).build();
	}
	
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{commentId}")
	public Response updateComment(@PathParam("messageId") int msgId, @PathParam("commentId") String commentId)
	{
		return Response.ok("Updating comment " + commentId +" asscociated with message " + msgId ).build();
	}
}
