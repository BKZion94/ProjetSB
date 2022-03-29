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
import com.company.core.service.AvailableCopieException;
import com.company.core.service.BorrowService;
import com.company.core.service.DepassementException;

import com.company.core.service.QuotasExceedException;

@RestController
public class BorrowRestController {
	
	@Autowired
	private BorrowService borrowService;


	
	public BorrowRestController(BorrowService borrowService) {
		this.borrowService=borrowService;
	}
	
	
	@GetMapping("/borrow")	
	public List<Borrow> visuBorrow (){
		
		return borrowService.findAllBorrow();
	}
	
	@PostMapping("/borrow/{id}")
	public ResponseEntity<Borrow> createAEmprunt(@PathVariable Long id, @RequestBody List<Item> items) throws AvailableCopieException, QuotasExceedException {
		User borrower = new User();
		borrower.setId(id);
		
		return new ResponseEntity<Borrow>(borrowService.makeABorrow(borrower, items), HttpStatus.CREATED);
	}

	@DeleteMapping("/borrow/{id}")
	public Borrow RestituteAEmprunt(@PathVariable Long id) throws DepassementException, ItemNotFoundException {
		Borrow borrow = new Borrow();
		borrow.setId(id);
		
		return borrowService.returnABorrow(borrow);
	}
	
	
	
}
