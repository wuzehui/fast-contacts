package com.chinadreamer.contacts.message.error.dao;

import java.util.Locale;

public interface ErrorMsgDao {
	public String getErrorMsgByCodeAndLocal(String code, Locale locale);
}
