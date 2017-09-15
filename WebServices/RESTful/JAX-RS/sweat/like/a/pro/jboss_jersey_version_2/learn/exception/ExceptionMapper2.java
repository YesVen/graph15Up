package like.a.pro.jboss_jersey_version_2.learn.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionMapper2 extends Exception implements ExceptionMapper<ExceptionMapper2> 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * These will be a default values for below fields. If user don't provide, it we used
	 */
	private Status status = Status.INTERNAL_SERVER_ERROR;
	private String returnMediaType = MediaType.TEXT_HTML;

	/*
	 * If user throws exception without mentioning error message, show default error message
	 */
	public ExceptionMapper2() {
		super("Some Exception Occured in server side. Please contaxct system admin");
	}
	
	public ExceptionMapper2(String msg)
	{
		super(msg);
	}
	
	public ExceptionMapper2(String msg, String returnMediaType)
	{
		super(msg);
		this.returnMediaType = returnMediaType;
		
	}
	
	public ExceptionMapper2(String msg, String returnMediaType, Status status)
	{
		super(msg);
		this.returnMediaType = returnMediaType;
		this.status = status;
	}
	
	
	@Override
	public Response toResponse(ExceptionMapper2 ex) 
	{
		return Response.status(ex.status)
				.entity(ex.status.getStatusCode() +" "+ ex.status.getReasonPhrase() + " "+ ex.getMessage())
				.type(returnMediaType)
				.build();
	}
		
}
