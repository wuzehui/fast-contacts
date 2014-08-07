package com.chinadreamer.contacts.common.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.data.domain.Persistable;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract @Getter @Setter class BaseEntity<ID extends Serializable> implements Persistable<ID>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2069064402298523676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;
	
	@Version
	@Column(name = "version")
	private Long version = 0l;
	
	public boolean isNew(){
		return null == getId();
	}
}
