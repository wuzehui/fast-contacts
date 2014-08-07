package com.chinadreamer.contacts.sys.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.chinadreamer.contacts.common.entity.BaseEntity;
import com.chinadreamer.contacts.sys.user.constant.UserStatus;

@Entity
@Table(name = "fc_sys_user")
public @Getter @Setter class User extends BaseEntity<Long>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8411880674519504286L;

	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String salt;
	
	@Column
	private String name;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private UserStatus status;
	
	@Column(name = "cust_code")
	private String custCode;

}
