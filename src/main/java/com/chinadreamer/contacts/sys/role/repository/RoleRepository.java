package com.chinadreamer.contacts.sys.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinadreamer.contacts.sys.role.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	public Role findByCode(String code);
}
