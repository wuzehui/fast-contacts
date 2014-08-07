package com.chinadreamer.contacts.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.chinadreamer.contacts.user.constant.UserStatus;

@Entity
@Table(name = "fc_sys_user")
public @Getter @Setter class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4145421549520155420L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
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
