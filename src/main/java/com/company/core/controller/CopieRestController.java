package com.company.core.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.entity.Copie;
import com.company.core.entity.Item;
import com.company.core.repository.CopieRepository;

@RestController
@RequestMapping("/copie")

public class CopieRestController {

	private CopieRepository copieRepository;

	public CopieRestController(CopieRepository copieRepository) {
		this.copieRepository=copieRepository;
	}
	
	@GetMapping("dispo/{id}")
	public List<Copie> findCopiebyItem(@PathVariable Long id){
		Item item=new Item();
		item.setId(id);
		return copieRepository.copiedispo(item);
	}
	
	
	@GetMapping("undispo/{id}")
	public List<Copie> findCopiebyNoItem(@PathVariable Long id){
		Item item=new Item();
		item.setId(id);
		return copieRepository.copieNondispo(item);
	}

	
}
