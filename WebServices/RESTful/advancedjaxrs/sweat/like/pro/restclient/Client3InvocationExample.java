package sweat.like.pro.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class Client3InvocationExample {
	public static void main(String[] args) {
		
		
		Invocation target  = getTarget();
		/*
		 * This is classic way to out source the work of building the requests.
		 * 
		 * Similar like JPO.invoke
		 */
		Response response = target.invoke();		
		
		if(response.getStatus() == Status.OK.getStatusCode())
		{
			System.out.println("Response : " + response.readEntity(String.class));
		}
		else
		{
			System.out.println("Something fishy");
		}
		
	}

	private static Invocation getTarget() {
		Client client  = ClientBuilder.newClient();
		return client.target("http://localhost:8080/advancedjaxrs/webapi/resourcesfour/today")
				.request().buildGet();
	}
}
