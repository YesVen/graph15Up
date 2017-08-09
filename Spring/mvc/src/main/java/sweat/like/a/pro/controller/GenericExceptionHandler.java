package sweat.like.a.pro.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * This acts as an advice to all the controllers running in the system
 * 
 * By default a scope of @exceptionHandler is controller so it is good idea to put it together in 
 * a class and use @ControllerAdvice 
 *
 * Spring also provides the way of configuration for this stuff like below,
 * 
 * <bean id="exceptionResolver" class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
		<property name="defaultErrorView" value="GenericExceptionView"></property>
		<property name="defaultStatusCode" value="500"></property>
		<property name="exceptionMappings">
			<map>
				<entry key="NullPointerException" value="NullPointerExceptionView"></entry>
				<entry key="IOException" value="IOExceptionView"></entry>
				<entry key="Exception" value="/exception/GenericExceptionView"></entry>
			</map>
		</property>
		
		<property name="warnLogCategory" value="MVCLogger"></property>
	</bean>
 *
 */
@ControllerAdvice
public class GenericExceptionHandler {
	
	@ExceptionHandler(value=NullPointerException.class)
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR) // we can also use it at class level
	public ModelAndView prcoessNullPointerException(Exception ex)
	{
		System.out.println("Exception is "+ ex.getMessage());
		
		return new ModelAndView("/exception/NullPointerExceptionView");
	}
	
	@ExceptionHandler(value=Exception.class)
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)// we can also use it at class level
	public ModelAndView prcoessGenericException(Exception ex)
	{
		System.out.println("Exception is "+ ex.getMessage());
		
		return new ModelAndView("/exception/GenericExceptionView");
	}
	
	
	@ExceptionHandler(value=IOException.class)
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)// we can also use it at class level
	public ModelAndView prcoessIOException(Exception ex)
	{
		System.out.println("Exception is "+ ex.getMessage());
		
		return new ModelAndView("/exception/IOExceptionView");
	}
}
