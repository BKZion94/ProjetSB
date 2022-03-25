package com.company.core.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.company.core.entity.Borrow;
import com.company.core.entity.Item;
import com.company.core.entity.User;
import com.company.core.repository.BorrowRepository;
import com.company.core.repository.CopieRepository;
import com.company.core.repository.ItemRepository;
import com.company.core.repository.UserRepository;

@Service
@Transactional

public class BorrowService {

	BorrowRepository borrowRepository;
	CopieRepository copieRepository;
	ItemRepository itemRepository;
	UserRepository userRepository;
	
	
	public String MakeABorrow(Long id,List<Item>items)  {
		
		// Un User veut effectuer un emprunt 
		User user=new User();
		//user=userRepository.findById(id);
		
		//Trouver combien il a d'emprunt 
		List<Borrow> emprunt;
		emprunt=borrowRepository.findByBorrower(user);
		
		//Condition du nombre d'emprunt 
		int a=items.size();
		int b=emprunt.size();
		

		
	return null;
	}
	
	
}
