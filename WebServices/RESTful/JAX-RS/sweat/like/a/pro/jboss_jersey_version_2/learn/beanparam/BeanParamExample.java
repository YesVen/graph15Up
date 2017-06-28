package like.a.pro.jboss_jersey_version_2.learn.beanparam;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class BeanParamExample {

	@POST
	@Path("/products")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public FAOProduct createProduct(@BeanParam FAOProduct product)
	{
		//Create new resource FAOproduct and return it to back
		FAOProduct newProd = new FAOProduct(product.getName(), product.getType(),
				product.getRevision(), product.getCost(), product.getCostPaidBy());
		System.out.println(newProd);
		return newProd;
	}
	
	@POST
	@Path("/productstest")
	@Produces(MediaType.APPLICATION_JSON)
	public FAOProduct createProductFromQueryParams(@BeanParam FAOProduct product)
	{
		//Create new resource FAOproduct and return it to back
		FAOProduct newProd = new FAOProduct(product.getName(), product.getType(),
				product.getRevision(), product.getCost(), product.getCostPaidBy());
		System.out.println(newProd);
		return newProd;
	}
	
	@GET
	@Path("/bean/path/{type}/{name}/{revision}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public FAORawMaterial testRM(@BeanParam FAORawMaterial rawMaterial)
	{
		System.out.println(rawMaterial);
		return rawMaterial;
	}
	
	
}
