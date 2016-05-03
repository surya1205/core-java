package com.leo.freemarkersample;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ranch")
public class RanchController {

	
	@RequestMapping(value="/{season}/gallery/{photo_id:[\\d]+}",method=RequestMethod.GET)
	public ModelAndView gallery(HttpServletRequest request,@PathVariable String season,@PathVariable String photo_id) {
		System.out.println("RanchController.gallery method begins");
		System.out.println("Season is --> "+season);
		System.out.println("photo_id is --> "+photo_id);
		
		ModelAndView mav = new ModelAndView();
		
		
		
		return mav;
	}
	
	
	@RequestMapping(value="/{season}/gallery/{filter:[a-z]+}",method=RequestMethod.GET)
	public ModelAndView gallery1(HttpServletRequest request,@PathVariable String season,@PathVariable String filter) {
		System.out.println("RanchController.gallery method begins");
		System.out.println("Season is --> "+season);
		System.out.println("filter is --> "+filter);
		
		ModelAndView mav = new ModelAndView();
		
		
		
		return mav;
	}
	
	
	/*@RequestMapping(value={"/{season}/gallery","/{season}/gallery/filter/{filter_name}"},method=RequestMethod.GET)
	public ModelAndView gallery2(HttpServletRequest request,@PathVariable String season,@PathVariable String filter_name) {
		System.out.println("RanchController.gallery method begins");
		System.out.println("Season is --> "+season);
		System.out.println("Filter is --> "+filter_name);
		
		ModelAndView mav = new ModelAndView();
		
		
		
		return mav;
	}*/
	
}
