package com.chinadreamer.contacts.sys.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.chinadreamer.contacts.common.entity.BaseEntity;
import com.chinadreamer.contacts.sys.role.entity.Role;

@Entity
@Table(name = "fc_user_role_mapping")
public class UserRole extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5628564578844099720L;

	@Column
	private String username;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username",referencedColumnName = "username",updatable=false,insertable=false)
	private User user;
	
	@Column(name = "role_code")
	private String roleCode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_code",referencedColumnName="code",updatable = false, insertable = false)
	private Role role;
}
