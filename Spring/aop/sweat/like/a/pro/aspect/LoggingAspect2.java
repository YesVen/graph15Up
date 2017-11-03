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
public class LoggingAspect2 {

	@Before("execution(public String getName())")
	public void firstAspect(JoinPoint joinPoint)
	{
		Triangle target = (Triangle) joinPoint.getTarget();
		System.out.println("First advice target is of type " + target.getName());
	}
	
	/*
	 * This aspect is called for all methods which has one String argument
	 */
	/*@Before("args(String)")
	public void allSingleStringArgumentMethods()
	{
		System.out.println("Advice called for method having single String argument");
	}*/
	
	
	/*
	 * Similar as above. Just we are catching what string argument is passed.
	 * 
	 */
	@Before("args(name)")
	public void allSingleStringArgumentMethods(String name)
	{
		System.out.println("Advice called for method having single String argument. Argumment is \"" + name + "\"");
	}
	
	
	@After("execution(public void set*(..))")
	public void secondAdvice(){
		System.out.println("After advice for all setters");
	}
	
	/*
	 * Called only when getCircle runs without throwing exception
	 */
	@AfterReturning("execution(public void sweat.like.a.pro.service.ShapeService.getXYZ())")
	public void isExceptionOccurred()
	{
		System.out.println("No Exception");
	}
	
	/*
	 * Advice to run when any method which accepts one argument throws an error
	 */
	@AfterThrowing("args(sometext)")
	public void exceptionAdvice(String sometext)
	{
		System.out.println("Exception has been caught. something wrong with " + sometext);
	}
	
	
	
	
}
