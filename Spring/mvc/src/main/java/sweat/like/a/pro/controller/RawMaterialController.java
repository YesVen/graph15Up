package sweat.like.a.pro.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sweat.like.a.pro.customdataeditor.CustomNameEditor;
import sweat.like.a.pro.model.RawMaterial;

@Controller
@RequestMapping("/RawMaterial")
public class RawMaterialController {
	
	/*
	 * http://localhost:7001/SpringMVC/RawMaterial/createRawMaterialTest1/Fabric/2000?vendor=Company
	 */	
	@RequestMapping(value="/createRawMaterialTest1/{type}/{quantity}", method=RequestMethod.GET)
	public ModelAndView getRawMaterialForm(@PathVariable("type") String type,
			@PathVariable("quantity") int quantity, @RequestParam("vendor") String vendor)
	{
		ModelAndView modelAndView = new ModelAndView("/rawmaterial/CreateRawMaterialFormTest1");
		modelAndView.addObject("type", type);
		modelAndView.addObject("quantity", quantity);
		modelAndView.addObject("vendor", vendor);
		
		//U can pass complex object also
		//like modelAndView.addObject("obj", complexObject);
		
		return modelAndView;
	}
	
	
	
	/**
	 * This is improvement on above method.
	 * 
	 * Here rather than adding to many method arguments, we have clubbed together all the
	 * query params in a single Map and all the path params in single map
	 * 
	 * This limits your method arguments to only two, no matter how many path and query params being
	 * sent from your html form.
	 * 
	 */
	@RequestMapping(value="/createRawMaterialTest2/{type}/{quantity}", method=RequestMethod.GET)
	public ModelAndView getRawMaterialForm(@PathVariable Map<String,String> pathparams,
			@RequestParam Map<String,String> queryparams)
	{
		System.out.println("pathParams : " +pathparams);
		System.out.println("queryparams : " +queryparams);
		
		ModelAndView modelAndView = new ModelAndView("/rawmaterial/CreateRawMaterialFormTest1");
		
		modelAndView.addObject("type", pathparams.get("type"));
		modelAndView.addObject("quantity", pathparams.get("quantity"));
		modelAndView.addObject("vendor", queryparams.get("vendor"));
		
		return modelAndView;
	}
	
	
	@RequestMapping(value="/createRawMaterial", method=RequestMethod.GET)
	public ModelAndView getRawMaterialForm()
	{
		return new ModelAndView("/rawmaterial/CreateRawMaterialForm");
	}
	
	
	
	@RequestMapping( consumes="application/x-www-form-urlencoded", 
					 value="/createRawMaterial",
					 produces="text/html",
					 method=RequestMethod.POST)
	public ModelAndView createRawMaterial(@Valid @ModelAttribute(value="rawMaterialbean") RawMaterial rawMaterialBean,
											BindingResult result)
	{
		/*
		 * If there are any errors in binding then return the form to user for filling once again
		 */
		if(result.hasErrors())
		{
			return new ModelAndView("/rawmaterial/CreateRawMaterialForm");
		}
		
		System.out.println(rawMaterialBean);
		
		ModelAndView modelAndView = new ModelAndView("/rawmaterial/CreateRawMaterialResponse");
		modelAndView.addObject("rawMaterial", rawMaterialBean);
		modelAndView.addObject("message", "Raw Material "+ rawMaterialBean.getName() 
				+" Created Successfully with below details");

		
		return modelAndView;
	}
	
	/*
	 * Very important concept here
	 * This will be called before serving actual request for all the requestMapping methods of this class
	 */
	@ModelAttribute
	public void preProcessRequest(RawMaterial rawMaterialBean)
	{
		System.out.println("This will be run before all the methods in this controller");
		
		/*
		 * Note  we can modify bean properties here too :)
		 */
		System.out.println(rawMaterialBean.getCurrency());
	}
	
	
	/*
	 * This annotation will used while initialing binding
	 */
	@InitBinder
	public void customInitBeanProperties(WebDataBinder binder)
	{
		/*
		 * We don't want spring to auto fill value of id in RawMaterial bean.
		 */
		binder.setDisallowedFields(new String[]{"id"});
		
		/*
		 * Prepend "part-" to every raw material
		 */
		binder.registerCustomEditor(String.class, "name", new CustomNameEditor());
	}
	
	
}
