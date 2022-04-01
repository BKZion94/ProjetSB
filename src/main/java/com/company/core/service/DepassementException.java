package com.company.core.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class DepassementException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DepassementException(String criteria) {
		super("User returned the item late "+ criteria);
	}
}
