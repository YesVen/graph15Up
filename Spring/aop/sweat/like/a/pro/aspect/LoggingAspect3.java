package sweat.like.a.pro.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import sweat.like.a.pro.model.Triangle;

@Aspect
public class LoggingAspect3 {

	/*
	 * run this advice for all methods that accept a String paramater.
	 * 
	 * Sometimes you need access the actual return value – that was returned from method, 
	 * you can get that return value as shown using returning attribute inside @AfterReturning annotation.
	 * 
	 * In addition check what has been returned by joinpoint. (Get a handle to actual method return value)
	 */
	@AfterReturning(pointcut="args(name)",returning="returnName")
	public void advice1(String name, String returnName)
	{
		System.out.println("Advice called. Passed in value is "+ name + "and returned value is "+ returnName);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex",argNames="name")
	public void exceptionAdvice(String name)
	{
		
	}
	
}
