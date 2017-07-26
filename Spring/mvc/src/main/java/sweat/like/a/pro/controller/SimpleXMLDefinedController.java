package sweat.like.a.pro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * This controller is defined in XML.
 * 
 * Downside of such a controller is that your, xml configuration becomes nightmare
 * 
 * You can have only one method(handleRequestInternal : which actually serves the request)
 * in one controller.
 * 
 * @author DBE1
 *
 */

@Controller
public class SimpleXMLDefinedController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		/*
		 * Internal View Resolver comes into picture here.
		 * We have initialized a ModelAndView object with  logical "path to view"
		 * If we see declaration for Internal View Resolver in mvc.config.xml,
		 * 		it actually addes prefix and suffix to your view. So,
		 * 
		 *  new ModelAndView("test/showMessage"); gets mapped to
		 *  ----> /WEB-INF/view/test/showMessage.jsp
		 */
		ModelAndView data = new ModelAndView("test/showMessage");
		
		
		/*
		 * Message here is actual java variable used inside showMessage.jsp page
		 * 
		 * You can't put random value there
		 */
		data.addObject("message", "Hello World");
		
		return data;
		
	}
	
	
		 
}
