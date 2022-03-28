package com.company.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	// Pour tous les items
	public List<Item> getAllItems(){
		List<Item> items = new ArrayList<>();
		itemRepository.findAll()
		.forEach(items::add);
		return items;
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
	
	
	// Pour les CDs 
	

	public List<Cd> getAllCds(){
		List<Cd> cds = new ArrayList<>();
		itemRepository.findAllCd()
		.forEach(cds::add);
		return itemRepository.findAllCd();
	}

	public void addCds(Cd cd) {
		List<Cd> cds = new ArrayList<>();
		cds = itemRepository.findAllCd();
		cds.add(cd);
		itemRepository.save(cd);
	}

	public Item getCd(Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such Cd in the catalogue"));}
	
	
	
	public Item updateCd (Long id, Cd cd) {
		return itemRepository.save(cd);
	}
	

	// Pour les Dvds
	
	public List<Dvd> getAllDvds(){
		List<Dvd> dvds = new ArrayList<>();
		itemRepository.findAllDvd()
		.forEach(dvds::add);
		return dvds;
	}

	public Dvd addDvds(Dvd dvd) {
		return itemRepository.save(dvd);
	}

	public Item getDvd(Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such Cd in the catalogue"));}
	
	
	
	public Item updateDvd (Long id, Cd cd) {
		return itemRepository.save(cd);
	}

	
	public Dvd findByDirector(String director) {
		return itemRepository.findByDirectorContainsIgnoreCase(director).orElseThrow(() -> new EntityNotFoundException("No such Cd in the catalogue"));
	}
	
	
	
	// Pour les books
	
	public List<Book> getAllBooks(){
		List<Book> books = new ArrayList<>();
		itemRepository.findAllBook()
		.forEach(books::add);
		return books;
	}

	public Book addBooks(Book book) {
		return itemRepository.save(book);
	}

	public Item getBook(Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such Cd in the catalogue"));}
	
	
	
	public Item updateDvd (Long id, Book book) {
		return itemRepository.save(book);
	}
	
	
	public Book findByBook(String author) {
		return itemRepository.findByAuthorContainsIgnoreCase(author).orElseThrow(() -> new EntityNotFoundException("No such Cd in the catalogue"));
	}
	
	
	
}
