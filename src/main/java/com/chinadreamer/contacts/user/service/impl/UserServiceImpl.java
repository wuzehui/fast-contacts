package com.chinadreamer.contacts.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinadreamer.contacts.user.constant.UserStatus;
import com.chinadreamer.contacts.user.dao.UserDao;
import com.chinadreamer.contacts.user.entity.User;
import com.chinadreamer.contacts.user.repository.UserRepository;
import com.chinadreamer.contacts.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
//	@Resource(name = "userDao")
//	private UserDao userDao;
	
	@Resource
	private UserRepository userRepository;
	
	public User userLogin(String username, String password){
		//User user = this.userDao.userLogin(username, password);
		User user = this.userRepository.findByUsernameAndPassword(username, password);
		if (null == user) {
			throw new RuntimeException("user not exists or info error");
		}
		if (user.getStatus().equals(UserStatus.I)) {
			throw new RuntimeException("user is not available");
		}
		return user;
	}
}
