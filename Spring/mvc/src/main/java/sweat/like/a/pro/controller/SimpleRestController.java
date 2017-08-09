package sweat.like.a.pro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sweat.like.a.pro.model.RawMaterial;



/*
 * This is a convenience annotation that is itself annotated with @Controller and @ResponseBody.
 * i.e. We dont need to explicitely add @Controller and @ResponseBody.
 */
@RestController
public class SimpleRestController 
{
	  
	/*
	 * In order to use @reponseBody annotation we need jackson jars (for data conversion)
	 * 
	 *  This way we can skip the redundant MOdelAndView Object in return type
	 */
	@RequestMapping(value="/rawmaterials/{rmName}")
	public List<RawMaterial> getRawMaterials(@PathVariable("rmName") String pathItem)
	{
		System.out.println("Referenced URI paramter is " + pathItem);
		
		RawMaterial rawMaterial = new RawMaterial();
		rawMaterial.setRawMaterialName("Bonded Fabric 1");
		rawMaterial.setCurrency("YUan");
		ArrayList<RawMaterial> list = new ArrayList<RawMaterial>();
		list.add(rawMaterial);
		return list;
	}
}
