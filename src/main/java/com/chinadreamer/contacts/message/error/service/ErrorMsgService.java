package com.chinadreamer.contacts.message.error.service;

import java.util.Locale;

public interface ErrorMsgService {
	public String getErrorMsgByCodeAndLocal(String code, Locale locale);
}
