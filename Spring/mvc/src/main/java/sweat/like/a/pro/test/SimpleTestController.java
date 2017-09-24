package sweat.like.a.pro.test;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import sweat.like.a.pro.model.RawMaterial;

@RestController
public class SimpleTestController {

	
	@RequestMapping(consumes="GET", produces="JSON", value="/testD")
	public ModelAndView getTestData(@Valid @ModelAttribute RawMaterial rm, BindingResult result)
	{
		if(result.getAllErrors().size() > 0){
			return new ModelAndView("ssSdsdsdd");
		}
		ModelAndView m = new ModelAndView();
		m.setViewName("/dasdasddsad");//Has to be resolved by view esolver
		
		m.addObject("asaS", "SASSD");
		
		return m;
	}
}
