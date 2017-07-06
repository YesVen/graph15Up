package sweat.like.pro.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Client2 {
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		WebTarget rootTarget = client.target("http://localhost:8080/enovia");
		
		WebTarget aiTarget = rootTarget.path("/resources/AI");
		
		WebTarget serviceTarget = aiTarget.path("{servicename}");
		
		WebTarget webTarget = serviceTarget.resolveTemplate("servicename", "concreateMaterialTypes");
		
		fetchFabrics(webTarget);
		
		fetchLabels(webTarget);
	}

	private static void fetchLabels(WebTarget serviceTarget) {
		WebTarget target = serviceTarget.path("{type}");
		Builder request = target.resolveTemplate("type", "type_FabricTextiles").request();
		
		request = request
				.cookie("Cookie","JSESSIONID=7E5E323AC562D87C9B2DAA84E0DBD2E2");
		Response response = request.get();
		
		System.out.println(response.getEntity());
	}

	private static void fetchFabrics(WebTarget serviceTarget) {
		/*
		 * 
		 */
	}
}
