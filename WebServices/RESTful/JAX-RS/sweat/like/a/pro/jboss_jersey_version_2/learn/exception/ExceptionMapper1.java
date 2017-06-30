package like.a.pro.jboss_jersey_version_2.learn.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionMapper1 extends Exception implements ExceptionMapper<ExceptionMapper1> 
{

	private static final long serialVersionUID = 4630140919801146983L;

	public ExceptionMapper1() {
		super("Cannot Proceed Ahead. Please contact System Admin");
	}
	
	public ExceptionMapper1(String ex)
	{
		super(ex);
	}
	
	@Override
	public Response toResponse(ExceptionMapper1 ex) {
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(ex.getMessage())
				.type(MediaType.TEXT_PLAIN)
				.build();
	}
}
