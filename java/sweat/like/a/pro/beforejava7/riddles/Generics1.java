package sweat.like.a.pro.beforejava7.riddles;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
	public static void main(String[] args) {
		
		List names = new ArrayList();
		names.add("Dnyanesh");
		names.add(2);
		names.add(new Object());
		
		test(names);
		
		
		List<Object> objectsOnlyList = new ArrayList<Object>();
		objectsOnlyList.add(new Object());
		objectsOnlyList.add("Dnyanesh");
		objectsOnlyList.add(2);
		
		test(objectsOnlyList);
	}
	
	public static void test(List<Object> list){
		System.out.println(list);
	}
	
}
