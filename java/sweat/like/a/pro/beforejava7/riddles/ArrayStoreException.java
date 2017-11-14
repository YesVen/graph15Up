package suite;

public class ArrayStoreException {
	public static void main(String[] args) {
		
		Object[] links = new Object[10];
		links[0] = "Dnyanesh";
		links[1] = 2;//No Error
		System.out.println("Links : " + links);
		
		
		Object[] names = new String[10];
		names[0] = "Dnyanesh";
		//You cannot add an int into string array.
		names[1] = 2;//Array Store Exception
		System.out.println(names);
		
		
		String[] places = new String[10];
		places[0] = "Pune";
		places[1] = 2;//Compile Time Error
		System.out.println(places);
	}
	
}
