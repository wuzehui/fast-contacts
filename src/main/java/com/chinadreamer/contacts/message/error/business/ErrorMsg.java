package com.chinadreamer.contacts.message.error.business;

import java.util.Locale;

public interface ErrorMsg {
	public String getErrorMsgByCodeAndLocal(String code, Locale locale);
}
