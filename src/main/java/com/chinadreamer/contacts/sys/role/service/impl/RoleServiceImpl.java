package com.chinadreamer.contacts.sys.role.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinadreamer.contacts.sys.role.entity.Role;
import com.chinadreamer.contacts.sys.role.repository.RoleRepository;
import com.chinadreamer.contacts.sys.role.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	@Resource
	private RoleRepository repository;
	
	public Role findRoleByCode(String code){
		return this.repository.findByCode(code);
	}
}
