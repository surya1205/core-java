package com.controller;

import java.util.Map;

import javax.validation.Valid;

import com.form.LoginForm;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("loginform.html")
public class LoginController {
	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Valid LoginForm loginForm, BindingResult result,
			Map model) {
		String userName = "admin";
		String password = "apple";
		if (result.hasErrors()) {
			return "loginform";

		}
		loginForm = (LoginForm) model.get("loginForm");
		if (!loginForm.getUserName().equals(userName)
				|| !loginForm.getPassword().equals(password)) {
			return "loginerror";
		}
		model.put("loginForm", loginForm);
		return "loginsuccess";
	}
}
