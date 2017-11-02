package sweat.like.a.pro.beforejava7.riddles.ootb;

import sweat.like.a.pro.beforejava7.riddles.ootb.protect.Landline;

public class Protected1 {
	public static void main(String[] args) {
		Phone p = new Phone();
		//test method is protected is protected
		//It is accessible here since its been accessed from same package
		p.test();
		
		// Even though Landline class is in diffrent package, I can access test method landline 
		//in Protected1 class through reference because we are not overriding test in Landline class
		//So it works as if its from Phone class which falls within same package as that of PRotected1
		Landline l = new Landline();
		l.test();
		
		//try - override test in Landline with protected modifier 
		//If we override test in Landline with protected modifier it will give compiler error for above 
		//l.test() call
		
		
		//This is tricky way to get protected method called
		l.doSomething();
		
	}
}
