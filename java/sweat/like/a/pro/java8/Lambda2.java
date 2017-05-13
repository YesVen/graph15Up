package sweat.like.a.pro.java8;

public class Lambda2 {

	public static void main(String args[])
	{
		//labmda with one parameter
		OneParameter lambdaone = (String s) ->
		{
			return s.length();
		};
		System.out.println(lambdaone.getLength("Dnyanesh"));
		
		OneParameter lambdatwo = s -> s.length();
		System.out.println(lambdatwo.getLength("Dnyanesh"));
		
		//Lambda with two parameters
		TwoParameter lambadathree = (String fname, String lname) -> {
			return fname + " " + lname;
		};
		System.out.println(lambadathree.getFullName("Dnyanesh", "Ashu"));
		
		TwoParameter lambadafour = (fname, lname) -> fname + " " + lname;
		System.out.println(lambadafour.getFullName("Dnyanesh", "Ashu"));
	}
	
	
	@FunctionalInterface
	interface OneParameter
	{
		int getLength(String name);
	}
	
	@FunctionalInterface
	interface TwoParameter
	{
		String getFullName(String fname, String lname);
	}
}
