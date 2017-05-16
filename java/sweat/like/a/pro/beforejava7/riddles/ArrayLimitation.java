package sweat.like.a.pro.beforejava7.riddles;


/**
 * Limitaion of Array : fixed is size. We cannot increae size or decrease size.
 * 			   Array hold elements of type t1 ot its subtype where t1 id Atrray's Type
 * @author Nightfury
 *
 */
public class ArrayLimitation {
	public static void main(String[] args) {
		Test[] t1 = new Test[10];
		
		t1[0] = new Test(); // compiles fine
		
		//t1 holds elements of type Test or its subtypes
		t1[1] = new Object() // compile time error
				
		Object[] o = new Object[33];
		
		o[0] = new Test(); // compiles fine
		
		o[1] = new Object(); // compiles fine
				
	}
}

class Test{}
