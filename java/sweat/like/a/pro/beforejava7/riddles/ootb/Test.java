package sweat.like.a.pro.beforejava7.riddles.ootb;

/**
 * What will the output of the below program?
 * 	NullpointerException????
 *
 *
 *	Think one more time??
 */

public class Test {

	public static int num = 0;
	
	public static String foo(){
		System.out.println("Test foo called");
		return "";
	}
	
	public static void main(String args[]){
		Test obj = null;
		System.out.println(obj.num);
		System.out.println(obj.foo());
	}
}

/*
 * The reason we dont get nullpointer exception is due to code optimization
 * When compiler generates bytecode it sees that static method is getting called 
 * So it sees that it should be called using Class reference and replaces the same.
 * 
 * So actual line becomes, Test.foo();
 * 
 * Happy ending!!
 * 
 */ 
