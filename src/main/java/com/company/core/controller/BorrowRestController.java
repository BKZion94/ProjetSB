package com.company.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.controller.views.ItemsViews;
import com.company.core.entity.Borrow;
import com.company.core.entity.Copie;
import com.company.core.entity.Item;
import com.company.core.repository.BorrowRepository;
import com.company.core.repository.ItemRepository;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("/api/borrow")
public class BorrowRestController {
	private final BorrowRepository borrowRepository;

	public BorrowRestController(BorrowRepository borrowRepository) {
		this.borrowRepository = borrowRepository;
	}
	
	@GetMapping
	@JsonView(ItemsViews.List.class)
	public Optional <Borrow> findByCopie() {
		Long id =1l;
		return borrowRepository.findById(id);
	}
}
