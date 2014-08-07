package com.chinadreamer.contacts.message.error.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinadreamer.contacts.message.error.entity.ErrorMsg;

public interface ErrorMsgRepository extends JpaRepository<ErrorMsg, Long>{
	public ErrorMsg findByCodeAndLocale(String code, String locale);
}
