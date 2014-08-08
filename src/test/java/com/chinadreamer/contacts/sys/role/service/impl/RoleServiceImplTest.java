package com.chinadreamer.contacts.sys.role.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import com.chinadreamer.contacts.sys.role.entity.Role;
import com.chinadreamer.contacts.sys.role.entity.RoleAuth;
import com.chinadreamer.contacts.sys.role.service.RoleService;
import com.chinadreamer.test.TestBase;

public class RoleServiceImplTest extends TestBase{

	@Resource(name = "roleService")
	private RoleService roleService;
	@Test
	public void testFindRoleByCode() {
		Role role = this.roleService.findRoleByCode("ADMIN");
		assertNotNull(role);
		System.out.println("角色：" + role.getName());
		for (RoleAuth roleAuthMapping : role.getRoleAuthMappings()) {
			System.out.println("权限：" + roleAuthMapping.getAuthority().getName());
		}
	}

}
