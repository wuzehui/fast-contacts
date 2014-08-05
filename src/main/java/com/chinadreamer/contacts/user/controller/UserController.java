package com.chinadreamer.contacts.user.controller;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chinadreamer.contacts.message.error.business.ErrorMsg;
import com.chinadreamer.contacts.user.constant.UserConstant;
import com.chinadreamer.contacts.validation.user.UserValidator;

@Controller
@RequestMapping("fastcontacts")
public class UserController {
	@Resource(name = "userValidator")
	private UserValidator userValidator;
	@Resource(name = "errorMessage")
	private ErrorMsg errorMsg;
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(Model model,
			HttpServletRequest request){
		String username = StringUtils.isEmpty(request.getParameter("username")) ? "" : request.getParameter("username").trim();
		String password = StringUtils.isEmpty(request.getParameter("password")) ? "" : request.getParameter("password").trim();
		if (!userValidator.validLoginParams(username, password)) {
			//TODO get user locale
			model.addAttribute("result", errorMsg.getErrorMsgByCodeAndLocal(UserConstant.USERNAME_PASS_ERROR, Locale.CHINA));
			return "login";
		}
		//get user menu
		return "login";
	}
}
