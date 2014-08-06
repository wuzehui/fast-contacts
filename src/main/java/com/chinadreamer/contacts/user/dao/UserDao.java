package com.chinadreamer.contacts.user.dao;

import com.chinadreamer.contacts.user.dto.User;

public interface UserDao {
	public User userLogin(String username, String password);
	public User findByUsername(String username);
}
