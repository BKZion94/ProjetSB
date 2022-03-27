package com.company.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {

	
	
	
	@RequestMapping("/hello")
	public String saHi() {
		return "Hi";
	}
}
