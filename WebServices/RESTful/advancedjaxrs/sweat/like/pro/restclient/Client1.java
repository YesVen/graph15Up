package sweat.like.pro.restclient;

import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class Client1 {
	public static void main(String[] args) {
		Client client  = ClientBuilder.newClient();
		
		Response response = client.target("http://localhost:8080/advancedjaxrs/webapi/resourcesfour/today")
		.request().get();
		
		System.out.println(response.readEntity(String.class));
	}
}
