package com.company.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.entity.Borrow;
import com.company.core.entity.Item;
import com.company.core.entity.User;
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
	
	@PostMapping("/borrow")
	public Borrow createBorrow(@RequestBody User borrower, @RequestBody List <Item> items) throws AvailableCopieException, QuotasExceedException{
		
		
		return borrowService.makeABorrow(borrower, items);

	}
	
	
	@DeleteMapping("/borrow")
	public Borrow deleteBorrow(@PathVariable Long id) throws DepassementException {
	
		
		
		return borrowService.returnABorrow(borrow);
	}
	
	
	
	
}
