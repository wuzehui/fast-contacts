package com.chinadreamer.contacts.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("fastcontacts")
public class UserController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model){
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(Model model,HttpServletRequest request){
		System.out.println(request.getParameterNames());
		System.out.println(request.getParameter("username"));
		return "login";
	}
}
