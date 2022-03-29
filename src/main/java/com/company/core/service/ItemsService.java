package com.company.core.service;


import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.core.entity.Book;
import com.company.core.entity.Cd;
import com.company.core.entity.Dvd;
import com.company.core.entity.Item;
import com.company.core.repository.ItemRepository;


@Service
public class ItemsService {
	@ Autowired
	ItemRepository itemRepository;
	
	
	public List<Item> getAllItems(){
		return 	itemRepository.findAll();
	}

	public void addItems(Item item) {
		itemRepository.save(item);
	}

	public Item getItem(Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such User"));}
	
	
	
	public void updateItem (Long id, Item item) {
		itemRepository.save(item);
	}
	
	
	public void deleteItem(Long id) {
		itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such User"));
		itemRepository.deleteById(id);
	}
	

	public List<Item> getAllCds(){

		return itemRepository.findAllCd();
	}

	public void addCds(Cd cd) {
		itemRepository.save(cd);
	}

	public Item getCd(Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such Cd in the catalogue"));}
	
	
	
	public Item updateCd (Long id, Cd cd) {
		return itemRepository.save(cd);
	}

	
	public List<Item> getAllDvds(){
		return itemRepository.findAllDvd();

	}

	public Dvd addDvds(Dvd dvd) {
		return itemRepository.save(dvd);
	}

	public Item getDvd(Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such Cd in the catalogue"));}
	
	
	
	public Item updateDvd (Long id, Cd cd) {
		return itemRepository.save(cd);
	}


	
	public List<Item> getAllBooks(){
		
		return itemRepository.findAllBook();
		
	}

	public Book addBooks(Book book) {
		return itemRepository.save(book);
	}

	public Item getBook(Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such Cd in the catalogue"));}
	
	
	
	public Item updateDvd (Long id, Book book) {
		return itemRepository.save(book);
	}
	

	
	
	
}
