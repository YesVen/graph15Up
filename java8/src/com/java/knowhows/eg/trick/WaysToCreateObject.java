package com.java.knowhows.eg.trick;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class WaysToCreateObject implements Cloneable{

	
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IllegalArgumentException, InvocationTargetException 
	{
		//new keyword
		WaysToCreateObject obj1 = new WaysToCreateObject();
		
		
		//Class.forname
		WaysToCreateObject obj3  = (WaysToCreateObject) Class.forName("com.java.knowhows.eg.trick.WaysToCreateObject").newInstance(); 
		
		
		//Class.forname
		WaysToCreateObject obj2  = (WaysToCreateObject) Class.forName("com.java.knowhows.eg.trick.WaysToCreateObject")
				.getClassLoader().loadClass("com.java.knowhows.eg.trick.WaysToCreateObject").newInstance();
		
		//clone object
		WaysToCreateObject obj4 = (WaysToCreateObject)obj1.clone();
		
		//serialization and deserialization
		
		
		//Constructot.newInstance()
		Constructor<WaysToCreateObject>[] cons = (Constructor<WaysToCreateObject>[]) Class.forName("com.java.knowhows.eg.trick.WaysToCreateObject").getDeclaredConstructors();
		if(cons.length > 0){
			Constructor<WaysToCreateObject> con = cons[0];
			WaysToCreateObject obj5 = con.newInstance();
			System.out.println(obj5);
		}
		
		
		String str = "hello";
		str = str.concat("world");
		System.out.println(str);
		
		A a =new A();

	}

}

class A{
	A a = new A();
}
