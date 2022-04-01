package com.company.core.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.core.entity.Copie;
import com.company.core.entity.Item;
import com.company.core.repository.CopieRepository;

@Transactional
@Service
public class CopieService {

	@Autowired
	CopieRepository copieRepository;

	public List<Copie> findById(Long id){
		Item item=new Item();
		item.setId(id);
		return copieRepository.findByItem(item);
		
	}
}
