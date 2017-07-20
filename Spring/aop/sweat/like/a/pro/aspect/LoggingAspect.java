package sweat.like.a.pro.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	/**
	 * @Before("execution( * * *(..))
	 * 		Run this aspect before running method having
	 * 					any return type
	 * 					any modifier
	 * 					any name
	 * 					zero or many arguments
	 * 
	 * @Before("execution( * * *(*))
	 * 		Run this aspect before running method having
	 * 					any return type
	 * 					any modifier
	 * 					any name
	 * 					at least one argument
	 * 
	 * @Before("execution(public * sweat.like.a.pro.model.Circle.*())")
	 * 		Run this aspect before running all public methods of class Circle
	 * 
	 * @Before("execution(public * sweat.like.a.pro.model.*())")
	 * 		Run this aspect before running all public methods of all classes inside model package but excluding subpackages
	 * 
	 * @Before("execution(public * sweat.like.a.pro.model..())")
	 * 		Run this aspect before running all public methods of all classes inside model package including subpackages
	 * 
	 * @Before("execution(* * *(..)")
	 * 		each and every method in the system
	 */
	
	@Before("execution(public * sweat.like.a.pro.model.Circle.get*())")
	public void logFirstAdvice()
	{
		System.out.println("Runng first advice.");
	}
	
	@Before("execution(public * sweat.like.a.pro.model.Triangle.get*())")
	public void logSecondAdvice()
	{
		System.out.println("Runng second advice.");
	}
	
	
	
	
	
	
	
	
	
	
	@Before("allReDraw()")
	public void logThirdAdvice()
	{
		System.out.println("Runng Third advice.");
	}
	
	@Pointcut("execution(* *reDraw(..))")
	public void allReDraw(){}
	
	
	
}
