package com.chinadreamer.contacts.validation.user;

public interface UserValidator {
	/**
	 * validate if user login with valid parameters
	 * @param username
	 * @param password
	 * @return true if user name and password both r not null
	 */
	public boolean validLoginParams(String username, String password);
}
