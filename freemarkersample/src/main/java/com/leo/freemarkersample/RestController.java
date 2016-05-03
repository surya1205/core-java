package com.leo.freemarkersample;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import com.leo.entity.UpdateContactInfo_IN;
import com.leo.entity.UpdateContactInfo_OUT;
import com.leo.entity.UpdateEmail_IN;
import com.leo.entity.UpdateEmail_OUT;
import com.leo.entity.UpdateSecurityInfo_IN;
import com.leo.entity.UpdateSecurityInfo_OUT;

@Controller
@RequestMapping("/")
public class RestController {

	private static final Logger logger = LoggerFactory
			.getLogger(RestController.class);
	
	@RequestMapping(method=RequestMethod.POST,value="/account/updateContactInfo",headers="Accept=application/json")
	public @ResponseBody UpdateContactInfo_OUT updateContactInfo(HttpServletRequest request,@RequestBody UpdateContactInfo_IN in) {
		
		logger.debug("CCN: --> "+in.getCcn());
		logger.debug("Address1: --> "+in.getAddress1());
		logger.debug("Address2: --> "+in.getAddress2());
		logger.debug("state: --> "+in.getState());
		logger.debug("City: --> "+in.getCity());
		logger.debug("Zip code: --> "+in.getZipcode());
		logger.debug("Phone Number: --> "+in.getSecurityToken());
		logger.debug("Security Token: --> "+in.getSecurityToken());
		
		System.out.println("Content Type : "+request.getContentType());
		
		UpdateContactInfo_OUT out = new UpdateContactInfo_OUT();
		out.setResponseCode("000");
		out.setResponseMessage("Success");
		out.setSecurityToken(in.getSecurityToken());
		
		return out;
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/account/updateSecurityInfo",headers="Accept=application/json")
	public @ResponseBody UpdateSecurityInfo_OUT updateSecurityInfo(@RequestBody UpdateSecurityInfo_IN in) {
		UpdateSecurityInfo_OUT out = new UpdateSecurityInfo_OUT();
		
		logger.debug("CCN --> "+in.getCcn());
		logger.debug("New Password --> "+in.getNewPassword());
		logger.debug("Old Password --> "+in.getOldPassword());
		logger.debug("Security Question Answer --> "+in.getSecurityQuestionAnswer());
		logger.debug("Security Question Id --> "+in.getSecurityQuestionID());
		logger.debug("Security Token --> "+in.getSecurityToken());
		
		out.setResponseCode("000");
		out.setResponseMessage("Success");
		out.setSecurityToken(in.getSecurityToken());
		
		return out;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/account/updateEmail",headers="Accept=application/json")
	public @ResponseBody UpdateEmail_OUT updateSecurityInfo(@RequestBody UpdateEmail_IN in) {
		
		UpdateEmail_OUT out = new UpdateEmail_OUT();
		
		logger.debug("CCN --> "+in.getCcn());
		logger.debug("Email Address --> "+in.getEmailAddress());
		logger.debug("Security Token --> "+in.getSecurityToken());
		if(in.getSubscription()!=null) {
			logger.debug("Subscription status --> "+in.getSubscription().getSubscriptionStatus());
		}
		
		out.setResponseCode("000");
		out.setResponseMessage("Success");
		out.setSecurityToken(in.getSecurityToken());
		
		return out;
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/echo/{input}")
	public @ResponseBody UpdateEmail_OUT echo(@PathVariable String input) {
		
		logger.debug("Input is:"+input);
		
		UpdateEmail_OUT out = new UpdateEmail_OUT();
		out.setResponseCode("success");
		out.setResponseMessage("Email updated.");
		out.setSecurityToken("test");
		
		return out;
		
	}
	
	
}
