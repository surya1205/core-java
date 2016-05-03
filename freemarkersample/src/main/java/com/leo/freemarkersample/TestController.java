package com.leo.freemarkersample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Model model) {
		System.out.println("home method");
		ModelAndView mav = new ModelAndView();
		mav.addObject("controllerMessage",
				"This is the message from the controller!");
		mav.setViewName("homepage/home");
		return mav;
	}
	
}
