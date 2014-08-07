package com.chinadreamer.contacts.user.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.chinadreamer.contacts.user.entity.User;
import com.chinadreamer.contacts.user.service.UserService;
import com.chinadreamer.test.TestBase;

public class UserServiceImplTest extends TestBase{
	@Resource(name = "userService")
	private UserService userService;
	@Test
	@Rollback
	public void testUserLogin() {
		User user = this.userService.userLogin("test", "test");
		assertNotNull(user);
		System.out.println("姓名：" + user.getName());
	}

}
