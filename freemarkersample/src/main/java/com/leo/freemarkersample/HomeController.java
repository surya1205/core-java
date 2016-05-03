package com.leo.freemarkersample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyscape.browserhawk.BrowserHawk;
import com.cyscape.browserhawk.BrowserInfo;
import com.cyscape.browserhawk.ExtendedOptions;
import com.pmusa.orderHistory.vo.DummyVO;
/**
 * Sample controller for going to the home page with a message
 */
@Controller
@RequestMapping("/")
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	
	
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(HttpServletRequest request, Model model) {
		logger.info("Welcome home!");
		BrowserInfo bi = BrowserHawk.getBrowserInfo(request);
		
		//ExtendedOptions options = new ExtendedOptions();
		//options.addProperties("ConnectionSpeed");
		//ExtendedBrowserInfo extBI = BrowserHawk.getExtendedBrowserInfo(request, response, options);
		
		try {
			model.addAttribute("bi", ConvertObjectToMap(bi));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		model.addAttribute("controllerMessage",
				"This is the message from the controller!");
		return "home";
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST,value="/dateconversion",headers="Accept=application/json")
	public @ResponseBody DummyVO home(HttpServletRequest request) {
		DummyVO vo = new DummyVO();
		vo.setName("test");
		vo.setDate(new Date());
		return vo;
	}
	
	
	/*@RequestMapping(value = {"/test/{temp}","/test/{temp}/{temp1}","test/{temp}/{temp1}/{temp2}"}, method = RequestMethod.GET)
	public String test(Model model,@PathVariable String temp,@PathVariable String temp1,@PathVariable String temp2) {
		
		System.out.println("temp is:-->"+temp);
		System.out.println("temp1 is:-->"+temp1);
		System.out.println("temp2 is:-->"+temp2);
		
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage",
				"This is the message from the controller!");
		return "home";
	}*/

	
	/*@RequestMapping(value = "/account", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView modelAndView) {
		logger.info("Welcome at account page!");
		
		IndividualProfile ip = new IndividualProfile();
		
		ip.setFirstName("ROBERT");
    	ip.setMiddleInitial("");
    	ip.setLastName("MOSLEY");
    	ip.setAddress1("PO BOX 8058");
    	ip.setAddress2("");
    	ip.setState("TX");
    	ip.setCity("AUSTIN");
    	ip.setZipCode("78713");
    	ip.setSecurityQuestion(0);
    	ip.setEmailAddress("TEST@GMAIL.COM");
    	ip.setMarlboroSubscribed(1);
    	ip.setSuffix("");
		
		
		logger.debug("Profile Object is: --> " + ip);
	    
    	logger.debug("FirstName: --> " + ip.getFirstName());
    	logger.debug("Middle Intial: --> " + ip.getMiddleInitial());
    	logger.debug("LastName: --> " + ip.getLastName());
    	logger.debug("Address1: --> " + ip.getAddress1());
    	logger.debug("Address2: --> " + ip.getAddress2());
    	logger.debug("State: --> " + ip.getState());
    	logger.debug("City: --> " + ip.getCity());
    	logger.debug("ZipCode: --> " + ip.getZipCode());
    	logger.debug("Security Question: --> " + ip.getSecurityQuestion());
    	logger.debug("Email Address: --> " + ip.getEmailAddress());
    	logger.debug("Marlboro subscribe: --> " + ip.getMarlboroSubscribed());
    	logger.debug("Suffix is: --> " + ip.getSuffix());
		
		Map globalMap = new HashMap();
		
		Map temp = new HashMap();
		
		temp.put("test", "test");
		
		globalMap.put("m_teammarlboro",temp);
		
		modelAndView.addObject("m_teammarlboro", globalMap);
		
		modelAndView.setViewName("account/account");
		
		return modelAndView;
		
	}*/
	

	public static Map<String, Object> ConvertObjectToMap(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> pomclass = obj.getClass();
		pomclass = obj.getClass();
		Method[] methods = obj.getClass().getMethods();

		Map<String, Object> map = new HashMap<String, Object>();
		for (Method m : methods) {
			if (m.getName().startsWith("get") && !m.getName().startsWith("getClass")) {
				try {
					Object value = (Object) m.invoke(obj);
					map.put(m.getName().substring(3), (Object) value);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		return map;
	}
	
}
