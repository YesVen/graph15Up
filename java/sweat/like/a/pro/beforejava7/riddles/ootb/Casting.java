package sweat.like.a.pro.beforejava7.riddles.ootb;

class A{}
class B extends A{}
class C extends B{}
class D extends C{}
public class Casting {

	A a = new B();
	
	C c = (C)new B();
	
	D d = (D)new B();
	
	public static void main(String[] args) {
		boolean v = 3 * 0.1 == 0.3;
		System.out.println(Boolean.toString(v));
		
		String s1 = "java";
		String s2 = "java";
		
		s1 = "text";
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		//permutation("", s1);
	}
	
	
	private static void permutation(String perm, String word) 
	{ 
		if (word.isEmpty()) 
		{ 
			System.err.println(perm + word); 
		}
		else 
		{ 
			for (int i = 0; i<word.length(); i++) 
			{ 
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
			}
		} 
	}

}
