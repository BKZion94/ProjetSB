package com.company.core.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class QuotasExceedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public QuotasExceedException(String criteria) {
		super("User have already 3 items borrowed: "+ criteria);
	}
}
