package com.chinadreamer.contacts.user.controller;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinadreamer.contacts.message.error.business.ErrorMsg;
import com.chinadreamer.contacts.message.response.ResponseMsg;
import com.chinadreamer.contacts.user.constant.UserConstant;
import com.chinadreamer.contacts.user.dto.User;
import com.chinadreamer.contacts.user.service.UserService;
import com.chinadreamer.contacts.validation.user.UserValidator;

@Controller
@RequestMapping("fastcontacts")
public class UserController {
	@Resource(name = "userValidator")
	private UserValidator userValidator;
	@Resource(name="userService")
	private UserService userService;
	@Resource(name = "errorMessage")
	private ErrorMsg errorMsg;
	
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public ResponseMsg login(HttpServletRequest request){
		String username = StringUtils.isEmpty(request.getParameter("username")) ? "" : request.getParameter("username").trim();
		String password = StringUtils.isEmpty(request.getParameter("password")) ? "" : request.getParameter("password").trim();
		ResponseMsg responseMsg = new ResponseMsg();
		if (!userValidator.validLoginParams(username, password)) {
			responseMsg.setSuccess(false);
			responseMsg.setErrMsg(errorMsg.getErrorMsgByCodeAndLocal(UserConstant.USERNAME_PASS_ERROR, Locale.CHINA));
			return responseMsg;
		}
		User user = userService.userLogin(username, password);
		if (null == user) {
			responseMsg.setSuccess(false);
			responseMsg.setErrMsg(errorMsg.getErrorMsgByCodeAndLocal(UserConstant.USERNAME_PASS_ERROR, Locale.CHINA));
			return responseMsg;
		}
		responseMsg.setSuccess(true);
		responseMsg.setErrMsg(user.getUsername());
		return responseMsg;
	}
}
