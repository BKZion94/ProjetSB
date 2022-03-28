package com.company.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.entity.Borrow;
import com.company.core.entity.Copie;
import com.company.core.entity.Item;
import com.company.core.entity.User;
import com.company.core.repository.BorrowRepository;
import com.company.core.repository.UserRepository;
import com.company.core.service.AvailableCopieException;
import com.company.core.service.BorrowService;
import com.company.core.service.DepassementException;
import com.company.core.service.ItemsService;
import com.company.core.service.QuotasExceedException;

@RestController
public class BorrowRestController {
	
	@Autowired
	private BorrowService borrowService;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ItemsService itemService;
	
	public BorrowRestController(BorrowService borrowService) {
		this.borrowService=borrowService;
	}
	
	
	@GetMapping("/borrow")	
	public List<Borrow> visuBorrow (){
		
		return borrowService.findAllBorrow();
	}
	
	@PostMapping("/borrow/do/{id}")
	public Borrow createAEmprunt(@PathVariable Long id, @RequestBody List<Item> item) throws AvailableCopieException, QuotasExceedException {
		User borrower = new User();
		borrower.setId(id);
		
		return borrowService.makeABorrow(borrower, item);
	}

	
	
	
	
}
