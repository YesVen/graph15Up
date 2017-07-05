package sweat.like.pro.six;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;


@Provider
public class DateMessageBodyWriter implements MessageBodyWriter<Date> 
{

	/*
	 * This is deprecated so, we goona return -1 here
	 * (non-Javadoc)
	 * @see javax.ws.rs.ext.MessageBodyWriter#getSize(java.lang.Object, java.lang.Class, java.lang.reflect.Type, java.lang.annotation.Annotation[], javax.ws.rs.core.MediaType)
	 */
	@Override
	public long getSize(Date arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		return -1;
	}

	/*
	 * Here we register the types we want to convert as part of message body writer
	 * (non-Javadoc)
	 * @see javax.ws.rs.ext.MessageBodyWriter#isWriteable(java.lang.Class, java.lang.reflect.Type, java.lang.annotation.Annotation[], javax.ws.rs.core.MediaType)
	 */
	@Override
	public boolean isWriteable(Class<?> type, Type arg1, Annotation[] arg2, MediaType arg3) {
		return type.getName().equals(Date.class.getName());
	}

	/*
	 * This function actually writes conversion to out stream
	 */
	@Override
	public void writeTo(Date date, 
			Class<?> arg1, 
			Type arg2, 
			Annotation[] arg3, 
			MediaType arg4,
			MultivaluedMap<String, 
			Object> arg5,
			OutputStream out) throws IOException, WebApplicationException {
		
		out.write(date.toString().getBytes());
	}
	
}
