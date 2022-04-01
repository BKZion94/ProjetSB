package com.company.core.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AvailableCopieException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AvailableCopieException(String criteria) {
		super("No such copie: "+ criteria);
	}
}
