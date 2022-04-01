package com.company.core.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException(String criteria) {
		super("No such user: "+ criteria);
	}
}
