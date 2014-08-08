package com.chinadreamer.contacts.sys.user.controller;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinadreamer.contacts.filter.shiro.ShiroUtils;
import com.chinadreamer.contacts.message.error.service.ErrorMsgService;
import com.chinadreamer.contacts.message.response.ResponseMsg;
import com.chinadreamer.contacts.sys.user.constant.UserConstant;
import com.chinadreamer.contacts.sys.user.entity.User;
import com.chinadreamer.contacts.sys.user.service.UserService;
import com.chinadreamer.contacts.validation.user.UserValidator;

@Controller
@RequestMapping("fastcontacts")
public class UserController {
	
	private final static Logger LOGGER = Logger.getLogger(UserController.class);
	
	@Resource(name = "userValidator")
	private UserValidator userValidator;
	@Resource(name="userService")
	private UserService userService;
	@Resource(name = "errorMessage")
	private ErrorMsgService errorMsg;
	
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public ResponseMsg login(HttpServletRequest request){
		String username = StringUtils.isEmpty(request.getParameter("username")) ? "" : request.getParameter("username").trim();
		String password = StringUtils.isEmpty(request.getParameter("password")) ? "" : request.getParameter("password").trim();
		ResponseMsg responseMsg = new ResponseMsg();
		Subject currentUser = SecurityUtils.getSubject();
		UsernamePasswordToken token = null;
		if (!currentUser.isAuthenticated()) {
			token = new UsernamePasswordToken(username, password, true, request.getRemoteAddr());  
		}
		try {
			currentUser.login(token);
			responseMsg.setSuccess(true);
			return responseMsg;
		} catch (Exception e) {
			e.printStackTrace();
			responseMsg.setSuccess(false);
			responseMsg.setErrMsg(this.errorMsg.getErrorMsgByCodeAndLocal(UserConstant.USERNAME_PASS_ERROR, Locale.getDefault()));
			return responseMsg;
		}
	}
	
	@RequestMapping(value="mainBoard", method = RequestMethod.GET)
	public String loadUserMainBoard(Model model){
		User user = this.userService.findByUsername(ShiroUtils.getUser().getUsername());
		LOGGER.info("user name:" + user.getName());
		model.addAttribute("user", user.getName());
		return "homepage";
	}
}
