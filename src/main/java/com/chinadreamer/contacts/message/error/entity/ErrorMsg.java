package com.chinadreamer.contacts.message.error.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.chinadreamer.contacts.common.entity.BaseEntity;

import lombok.Setter;
import lombok.Getter;
@Entity
@Table(name = "fc_messages")
public @Getter @Setter class ErrorMsg extends BaseEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6284047298604594805L;

	@Column
	private String code;
	
	@Column
	private String locale;
	
	@Column
	private String description;
}
