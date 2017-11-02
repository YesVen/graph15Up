package sweat.like.a.pro.beforejava7.riddles.ootb.protect;

import sweat.like.a.pro.beforejava7.riddles.ootb.Phone;

public class Landline extends Phone {
	
	public void doSomething(){
		//protected method is accessible through inheritance only
		test();
	}
	
}
