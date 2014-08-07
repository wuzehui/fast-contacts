package com.chinadreamer.contacts.sys.authority.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.chinadreamer.contacts.common.entity.BaseEntity;

@Entity
@Table(name = "fc_sys_authority")
public @Setter @Getter class Authority extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5017523411885462977L;

	@Column
	private String code;
	
	@Column
	private String name;
	
}
