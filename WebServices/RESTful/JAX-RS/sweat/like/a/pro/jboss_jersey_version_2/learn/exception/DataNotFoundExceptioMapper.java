package like.a.pro.jboss_jersey_version_2.learn.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptioMapper implements ExceptionMapper<DataNotfoundException>
{
	@Override
	public Response toResponse(DataNotfoundException arg0) {
		return Response.status(Status.NOT_FOUND).entity(arg0.getMessage() + arg0.getDocumentationLink()).build();
	}
}
