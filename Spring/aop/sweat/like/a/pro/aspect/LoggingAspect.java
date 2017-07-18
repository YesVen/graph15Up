package sweat.like.a.pro.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public void draw())")
	public void logAdvice()
	{
		System.out.println("Advice run. Get method called.");
	}
}
