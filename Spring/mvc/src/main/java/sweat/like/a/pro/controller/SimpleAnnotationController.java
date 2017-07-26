package sweat.like.a.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/*
 * @Controller does tell spring to create bean of this class.
 * 
 * It also tells that its a Controller bean
 * 
 * This requires component-scan feature turned on.
 */
@Controller
public class SimpleAnnotationController {

	/*
	 * Serves the request mapped to /hello path.
	 * IT can be put in any controller class. That s the beauty of annotation.
	 */
	@RequestMapping("/hello")
	public @ResponseBody String GetHelloMessage()
	{
		return "Hello There!";
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/helloAgain")
	public @ResponseBody String test1()
	{
		return "Hello There Again!!";
	}
	
	
	/**
	 *	See here, we can skip @ResponseBody if we use ModelAndView
	 *	
	 */
	@RequestMapping("/hi")
	public ModelAndView sayHi()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/test/showMessage");
		modelAndView.addObject("message", "Hi There");
		
		return modelAndView;
	}
	
}
