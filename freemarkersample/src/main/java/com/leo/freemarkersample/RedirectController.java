package com.leo.freemarkersample;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
@RequestMapping("/team-marlboro")
public class RedirectController {

	@RequestMapping(value="/get-a-gift",method=RequestMethod.GET)
	public ModelAndView getForm(HttpServletRequest request) {
		
		System.out.println("Context Path is:--"+request.getContextPath());
		
		System.out.println("Scheme is:--"+request.getScheme());
		
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()) {
			String headerName =	headers.nextElement();
			String headerValue = request.getHeader(headerName);
			
			System.out.println("header Name is:--"+headerName);
			System.out.println("header Value is:--"+headerValue);
		}
		
		System.out.println("getForm method");
		
		ModelAndView mav = new ModelAndView();
		
		if(request.getParameter("offerid")!=null) {
			mav.addObject("offerID", request.getParameter("offerid"));
		}
		
		if(request.getParameter("itemid")!=null) {
			mav.addObject("itemID",request.getParameter("itemid"));
		}
		
		/*HttpSession session = request.getSession();
		if(session.getAttribute("offerid")!=null) {
			mav.addObject("offerID", session.getAttribute("offerid"));
		}
		if(session.getAttribute("itemid")!=null) {
			mav.addObject("itemID",session.getAttribute("itemid"));
		}*/
		
		/*Map flashMap = RequestContextUtils.getInputFlashMap(request);
	
		if(flashMap!=null && flashMap.size()>0) {
			mav.addObject("offerID",flashMap.get("offerid"));
			mav.addObject("itemID",flashMap.get("itemid"));
		}*/
		
		//mav.addObject("m_securityToken", "dummyToken");
		
		/*mav.addObject("offerID", "12210C");
		mav.addObject("itemID", "16120000001");*/
		
		mav.setViewName("homepage/home");
		
		return mav;
	}
	
	@RequestMapping(value="/get-a-gift",method=RequestMethod.POST)
	public ModelAndView bouncebackConfirmation(HttpServletRequest request,RedirectAttributes redirectAttributes) {
		String offerID = null;
		String itemID = null;
		
		if (request.getParameter("offerid") != null) {
			offerID = (String) request.getParameter("offerid");
		}
		if (request.getParameter("itemid") != null) {
			itemID = (String) request.getParameter("itemid");
		}
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("offerID", offerID);
		mav.addObject("itemID", itemID);
		
	/*	HttpSession session = request.getSession();
		
		
		session.setAttribute("offerid", offerID);
		session.setAttribute("itemid", itemID);*/
		
		//mav.setViewName("homepage/cigarette-litter-prevention");
		//mav.setViewName("redirect:/spring/team-marlboro/get-a-gift");
		
		/*ModelMap modelMap = new ModelMap();
		modelMap.*/

		/*mav.clear();
		
		redirectAttributes.addFlashAttribute("offerid", offerID);
		redirectAttributes.addFlashAttribute("itemid", itemID);*/
		
		//mav.setViewName("redirect:/spring/team-marlboro/get-a-gift");
		
		//return "redirect:/spring/team-marlboro/get-a-gift";
		
		mav.setViewName("homepage/home");
		
		return mav;
	}
	
}
