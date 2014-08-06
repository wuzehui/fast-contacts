package com.chinadreamer.contacts.message.error.dto;

import lombok.Setter;

import lombok.Getter;

public @Getter @Setter class ErrorMsg {
	private String code;
	private String locale;
	private String description;
}
