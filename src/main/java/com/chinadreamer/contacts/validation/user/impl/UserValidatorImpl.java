package com.chinadreamer.contacts.validation.user.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.chinadreamer.contacts.validation.user.UserValidator;

@Service("userValidator")
public class UserValidatorImpl implements UserValidator{
	public boolean validLoginParams(String username, String password){
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			return false;
		}
		return true;
	}
}
