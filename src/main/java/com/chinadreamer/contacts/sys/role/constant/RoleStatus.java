package com.chinadreamer.contacts.sys.role.constant;

import lombok.Getter;

public enum RoleStatus {
	A("ACTIVE"),
	I("INACTIVE");
	
	private @Getter String value;
	
	private RoleStatus(String value){
		this.value = value;
	}
	
	public static RoleStatus getUserStatus(String code){
		return (RoleStatus)RoleStatus.valueOf(RoleStatus.class, code);
	}
}
