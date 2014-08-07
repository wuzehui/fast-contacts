package com.chinadreamer.contacts.message.error.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Setter;
import lombok.Getter;
@Entity
@Table(name = "fc_messages")
public @Getter @Setter class ErrorMsg implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6284047298604594805L;
	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@Column
	private String code;
	
	@Column
	private String locale;
	
	@Column
	private String description;
}
