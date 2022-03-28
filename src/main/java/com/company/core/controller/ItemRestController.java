package com.company.core.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.entity.Cd;

import com.company.core.entity.Item;
import com.company.core.service.ItemsService;

@RestController
@RequestMapping("/items")
public class ItemRestController {


	private ItemsService itemService;



	public ItemRestController(ItemsService itemService) {
		this.itemService=itemService;
	}

	@GetMapping
	//@JsonView(ItemViews.List.Class)
	public List<Item> findAllItems() throws ItemNotFoundException{
		return itemService.getAllItems();
	}

	@GetMapping("/{id}")
	public Item getbyItem(@PathVariable long id) throws ItemNotFoundException{
		return itemService.getItem(id);
	}

	@GetMapping("/{type}")
	public Object recherche(@RequestParam(required=false) String type){
		Object o = new Object();

		if(type !=null) {
			if (type.equals("Dvd")) {
				o=itemService.getAllDvds();
			}
			else if (type.equals("Cd")) {
				o=itemService.getAllCds();}
			else if (type.equals("Book")){
				o=itemService.getAllBooks();	

			}
		}else {
			o=itemService.getAllItems();
		}

		return o;
	}


	
	
	
	
}
