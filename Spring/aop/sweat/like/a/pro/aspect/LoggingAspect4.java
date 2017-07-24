package sweat.like.a.pro.aspect;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import sweat.like.a.pro.model.Triangle;

@Aspect
public class LoggingAspect4 {

	
	@Around("allSetName()")
	public Object allSetNameAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		Object obj=null;
		System.out.println("Start Of advice");
		
		/*
		 * Preprocesssing that we want to do before calling actual method call.
		 */
		Object target = proceedingJoinPoint.getTarget();
		
		if(target instanceof Triangle)
		{
			System.out.println("Condition true so proceding woth the execution");
			obj = proceedingJoinPoint.proceed();
		}
		else
		{
			System.out.println("Condition false so not running the method.");
		}
		
		/*
		 * Method post processsing
		 */
		System.out.println("End Of advice\n\n");
		
		/*
		 * We can modify the object returned if we wish to. Note this the object actual method has returned
		 * So we can actually twist the returned value and thats pretty handy
		 */
		return obj;	
	}
	
	
	
	
	@Pointcut("execution(public void setName(String))")
	public void allSetName()
	{
	}
	
	
}
