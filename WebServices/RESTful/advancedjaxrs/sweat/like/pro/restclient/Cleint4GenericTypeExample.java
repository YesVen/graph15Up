package sweat.like.pro.restclient;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;

import sweat.like.pro.four.MyDate;

/*
 * Rest cannot handle generic types such as List, Map etc.
 * 
 * This program demonstrates how to handle this case
 */
public class Cleint4GenericTypeExample {

	public static void main(String[] args) {
		
		Client client  = ClientBuilder.newClient();
		
		List<MyDate> dateList = client.target("http://localhost:8080/advancedjaxrs/webapi/resourcesfour/today")
				.request()
				/*
				 * This is how we handle generic types.
				 * What this means is, i am no more expecting List but a class object of type GenericType.class
				 * and this class knows how to convert response back to generic type List
				 */
				.get(new GenericType<List<MyDate>>(){});
		
		System.out.println(dateList);
	}
	
	
}
