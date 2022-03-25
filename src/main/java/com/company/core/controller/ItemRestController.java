package com.company.core.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.controller.views.ItemsViews;
import com.company.core.entity.Cd;
import com.company.core.entity.Item;
import com.company.core.repository.ItemRepository;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("/api/item")
public class ItemRestController {

	
	
	private final ItemRepository itemRepository;

	public ItemRestController(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	@GetMapping
	@JsonView(ItemsViews.List.class)
	public List<Item> findAllCd() {

		return itemRepository.findAll();
	}
}



	

	