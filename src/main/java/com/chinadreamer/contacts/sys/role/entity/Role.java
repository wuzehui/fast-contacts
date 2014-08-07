package com.chinadreamer.contacts.sys.role.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.chinadreamer.contacts.common.entity.BaseEntity;
import com.chinadreamer.contacts.sys.role.constant.RoleStatus;


@Entity
@Table(name = "fc_sys_role")
public @Getter @Setter class Role extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5779422993812725981L;
	
	@Column
	private String code;
	
	@Column
	private String name;
	
	@Column
	@Enumerated(EnumType.STRING)
	private RoleStatus status;
	
	@Column
	private Integer level;
	
	@Column(name = "group_code")
	private String groupCode;
	
	@OneToMany(mappedBy = "role",fetch = FetchType.LAZY)
	private List<RoleAuthMapping> roleAuthMappings;
}
