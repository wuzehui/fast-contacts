package com.chinadreamer.contacts.sys.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinadreamer.contacts.sys.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findByUsernameAndPassword(String username, String password);
}
