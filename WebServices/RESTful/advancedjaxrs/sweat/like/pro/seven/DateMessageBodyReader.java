package sweat.like.pro.seven;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;


@Provider
public class DateMessageBodyReader implements MessageBodyReader<Date> 
{

	@Override
	public boolean isReadable(Class<?> type, Type arg1, Annotation[] arg2, MediaType arg3) {
		return type.getName().equals(Date.class.getName());
	}

	@Override
	public Date readFrom(Class<Date> arg0, Type arg1, Annotation[] arg2, MediaType arg3,
			MultivaluedMap<String, String> arg4, InputStream in) throws IOException, WebApplicationException {
		
		System.out.println("Reading data from inputstream");
		
		String data = "";
		int i = 0;
		// reads till the end of the stream
        while((in.read())!=-1) {
        
           // converts integer to character
           data = data + (char)i;
        }
		
        System.out.println(data);
        return new Date();
	}


	
}
