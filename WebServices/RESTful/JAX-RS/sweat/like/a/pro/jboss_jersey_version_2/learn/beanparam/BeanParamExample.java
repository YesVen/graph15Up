package like.a.pro.jboss_jersey_version_2.learn.beanparam;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
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
		
		return newProd;
	}
	
	@POST
	@Path("/productss")
	public FAOProduct createProduct()
	{
		//Create new resource FAOproduct and return it to back
				FAOProduct newProd = new FAOProduct("","","",1,"");
				
				return newProd;
	}
}
