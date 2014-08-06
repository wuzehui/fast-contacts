package com.chinadreamer.contacts.message.error.service.impl;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinadreamer.contacts.message.error.dao.ErrorMsgDao;
import com.chinadreamer.contacts.message.error.service.ErrorMsgService;

@Service("errorMessage")
public class ErrorMsgServiceImpl implements ErrorMsgService{
	@Resource(name = "errorMsgDao")
	private ErrorMsgDao errorMsgDao;
	
	public String getErrorMsgByCodeAndLocal(String code, Locale locale){
		return this.errorMsgDao.getErrorMsgByCodeAndLocal(code, locale);
	}
}
