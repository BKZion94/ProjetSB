package com.company.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.company.core.entity.Item;
import com.company.core.service.ItemNotFoundException;
import com.company.core.service.ItemsService;


@RestController
@RequestMapping("/items")
public class ItemRestController {

	@Autowired
	private ItemsService itemService;

	
	public ItemRestController(ItemsService itemService) {
		this.itemService=itemService;
	}

	
	@GetMapping
	public List<Item> findAllItems() throws ItemNotFoundException{
		return itemService.getAllItems();
	}

	
	@GetMapping("/{id}")
	public Item getbyItem(@PathVariable long id) throws ItemNotFoundException{
		return itemService.getItem(id);
	}

	
	@GetMapping("/search/{type}")
	public List<Item> recherche(@RequestParam(required=false) String type){
		
		if(type !=null) {
			if (type.equals("Dvd")) {
				return itemService.getAllDvds();
			}
			else if (type.equals("Cd")) {
				return itemService.getAllCds();
			} else 
				return itemService.getAllBooks();	
		} else {
			return itemService.getAllItems();
		}

	}

	
	@GetMapping("/new")
	public List<Item> whatsnew(){
		return itemService.whatsNew();
	}
		
}
