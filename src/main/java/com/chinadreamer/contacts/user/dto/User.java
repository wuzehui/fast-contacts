package com.chinadreamer.contacts.user.dto;

import lombok.Getter;
import lombok.Setter;

import com.chinadreamer.contacts.user.constant.UserStatus;

public @Getter @Setter class User {
	private String username;
	private String password;
	private String salt;
	private String name;
	private UserStatus status;
	private String custCode;
}
