package com.company.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.entity.Book;
import com.company.core.entity.Cd;
import com.company.core.entity.Dvd;
import com.company.core.entity.Item;
import com.company.core.repository.ItemRepository;
import com.company.core.service.ItemsService;

@RestController
@RequestMapping("/items")
public class ItemRestController {

	private ItemRepository itemRepository;
	private ItemsService itemService;
	
	
	
	public ItemRestController(ItemsService itemService) {
		this.itemService=itemService;
	}
	
	@GetMapping
	//@JsonView(ItemViews.List.Class)
	public List<Item> findAllItems() throws ItemNotFoundException{
		return itemService.getAllItems();
	}

	@GetMapping("/cds")
	public List<Cd> findAllCd() throws ItemNotFoundException{
		return itemService.getAllCds();
	}
	
	@GetMapping("/dvds")
	public List<Dvd> findAllDvd() throws ItemNotFoundException{
		return itemService.getAllDvds();
	}
	
	@GetMapping("/books")
	public List<Book> findAllBook() throws ItemNotFoundException{
		return itemService.getAllBooks();
	}
	
	@GetMapping("cds/search")
	public Cd findByArtist(@RequestParam (name="artist") String artist) throws ItemNotFoundException{
		return itemService.findByArtist(artist);
	}
	
	@GetMapping("dvds/search/{director}")
	public Dvd findByDirector(@RequestParam (name="director") String director) throws ItemNotFoundException{
		return itemService.findByDirector(director);
	}
	
	@GetMapping("books/search")
	public Book findByBook(@RequestParam (name="author") String author) throws ItemNotFoundException{
		return itemService.findByBook(author);
	}
	
	@GetMapping("/{id}")
	public Item getbyItem(@PathVariable long id) throws ItemNotFoundException{
		return itemService.getItem(id);
	}
	
	
	
	

	
	
	//@PostMapping("cds/addCds")
	
	//}
}
