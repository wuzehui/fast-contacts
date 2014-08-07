package com.chinadreamer.contacts.sys.user.constant;

import lombok.Getter;

public enum UserStatus {
	A("ACTIVE"),
	I("INACTIVE");
	
	private @Getter String value;
	
	private UserStatus(String value){
		this.value = value;
	}
	
	public static UserStatus getUserStatus(String code){
		return (UserStatus)UserStatus.valueOf(UserStatus.class, code);
	}
}
