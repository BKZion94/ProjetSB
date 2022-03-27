package com.company.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.controller.views.ItemsViews;
import com.company.core.entity.Borrow;
import com.company.core.repository.BorrowRepository;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class BorrowRestController {
	
	
	@RequestMapping("/borrow")
	
	public String findByCopie() {
		return "Hi";
	}
}
