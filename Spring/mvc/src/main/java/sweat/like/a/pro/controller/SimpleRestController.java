package sweat.like.a.pro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import sweat.like.a.pro.model.RawMaterial;



/*
 * This is a convenience annotation that is itself annotated with @Controller and @ResponseBody.
 * i.e. We dont need to explicitely add @Controller and @ResponseBody.
 */
@RestController
public class SimpleRestController 
{
	  
	/*
	 * This method supports both xml and json formats as we have not mentioned @produces annotation here
	 * If we want to support only one format then use @produces annotation
	 * 
	 * 
	 * In order to use @reponseBody annotation we need jackson jars (for data conversion)
	 * This way we can skip the redundant MOdelAndView Object in return type
	 */
	@RequestMapping(value="/rawmaterials/{rmName}"/*, produces=MediaType.APPLICATION_XML_VALUE*/)
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
	
	
	/**
	 * Run this service using postman  : http://localhost:8080/SpringMVC/rawmaterials/fabrics
	 * Set Content type to application/json
	 * add body as 
	 * 			{
					"raw_material_name" : "BF-01",
					"vendor" : "Sai Fabrication"
				}
	 */
	@RequestMapping(value="/rawmaterials/fabrics", method={RequestMethod.POST} )
	public ResponseEntity<Boolean> getFabrics(@RequestBody RawMaterial rawMaterial)
	{
		System.out.println(rawMaterial.getRawMaterialName());
		
		HttpHeaders headers = new HttpHeaders();
		
		//use HATEOAS
		String location = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/"+rawMaterial.getRawMaterialName()).toUriString();
		
		headers.add("Location", location);
		headers.add("PoweredBy", "HackerEverywhere");
		
		return new ResponseEntity<Boolean>(headers,HttpStatus.CREATED);
	}
	
	
	
}
