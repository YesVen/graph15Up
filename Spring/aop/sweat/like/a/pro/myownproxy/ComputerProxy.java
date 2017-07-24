package sweat.like.a.pro.myownproxy;

public class ComputerProxy extends Computer
{
	public void start(){
		
		//I can inject a code here which will act like a @before annotation in AOP
		System.out.println("Before Advice called. starting computer");
		
		super.start();
		
		//I can inject a code here which will act like a @after annotation in AOP
		System.out.println("After Advice called. starting computer");
	}
}
