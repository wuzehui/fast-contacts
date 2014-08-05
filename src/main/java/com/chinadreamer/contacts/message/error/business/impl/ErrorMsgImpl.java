package com.chinadreamer.contacts.message.error.business.impl;

import java.util.Locale;

import org.springframework.stereotype.Service;

import com.chinadreamer.contacts.message.error.business.ErrorMsg;

@Service("errorMessage")
public class ErrorMsgImpl implements ErrorMsg{
	public String getErrorMsgByCodeAndLocal(String code, Locale locale){
		//TODO
		return "";
	}
}
