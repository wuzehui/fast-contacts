package com.chinadreamer.contacts.message.error.service.impl;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinadreamer.contacts.message.error.repository.ErrorMsgRepository;
import com.chinadreamer.contacts.message.error.service.ErrorMsgService;

@Service("errorMessage")
public class ErrorMsgServiceImpl implements ErrorMsgService{
	@Resource
	private ErrorMsgRepository repository;
	
	public String getErrorMsgByCodeAndLocal(String code, Locale locale){
		return this.repository.findByCodeAndLocale(code, locale.getCountry()).getDescription();
	}
}
