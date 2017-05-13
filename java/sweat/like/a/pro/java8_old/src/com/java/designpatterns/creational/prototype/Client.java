package sweat.like.a.pro.java8_old.src.com.java.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Client 
{
	public static void main(String[] args) 
	{
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("Tom", new Tom());
		data.put("Dick", new Dick());
		
		
		ProtoTypeFactory obj = (ProtoTypeFactory)data.get("Tom");
		
		
		//Here cloning is responsibility of classs implementing the clone method.
		// Client here expect a clone of desired object without knowing the background details
		Tom tom = (Tom)obj.cloneMe();
	}
}
