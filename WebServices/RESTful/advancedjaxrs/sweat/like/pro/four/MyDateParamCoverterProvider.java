package sweat.like.pro.four;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

/**
 * This class is used to add custom provider for converting String coming in request to custom type.
 * 
 * 
 *
 */

@Provider
public class MyDateParamCoverterProvider implements ParamConverterProvider{

	/*
	 * 
	 * 
	 * (non-Javadoc)
	 * @see javax.ws.rs.ext.ParamConverterProvider#getConverter(java.lang.Class, java.lang.reflect.Type, java.lang.annotation.Annotation[])
	 */
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		
		if(rawType.getName().equals(MyDate.class.getName()))
		{
			return new ParamConverter<T>() {

				Calendar requestedDate = Calendar.getInstance();
				
				@Override
				public T fromString(String when) {
					if("tomorrow".equals(when))
					{
						requestedDate.add(Calendar.DATE, 1);
					}
					else if("yesterday".equals(when))
					{
						requestedDate.add(Calendar.DATE, -1);
					}
					MyDate date = new MyDate();
					
					date.setDate(String.valueOf(requestedDate.get(Calendar.DATE)));
					date.setMonth(String.valueOf(requestedDate.get(Calendar.MONTH)));
					date.setYear(String.valueOf(requestedDate.get(Calendar.YEAR)));
					return rawType.cast(date);
				}
	
				@Override
				public String toString(T mybean) {
					if(mybean == null)
					return null;
					
					return mybean.toString();
				}
			
			};
		}
		return null;
	}

}
