package com.chinadreamer.contacts.sys.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinadreamer.contacts.sys.user.constant.UserStatus;
import com.chinadreamer.contacts.sys.user.entity.User;
import com.chinadreamer.contacts.sys.user.repository.UserRepository;
import com.chinadreamer.contacts.sys.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserRepository userRepository;
	
	public User userLogin(String username, String password){
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
