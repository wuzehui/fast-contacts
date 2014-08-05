package com.chinadreamer.contacts.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinadreamer.contacts.user.dao.UserDao;
import com.chinadreamer.contacts.user.dto.User;
import com.chinadreamer.contacts.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource(name = "userDao")
	private UserDao userDao;
	
	public User userLogin(String username, String password){
		return this.userDao.userLogin(username, password);
	}
}
