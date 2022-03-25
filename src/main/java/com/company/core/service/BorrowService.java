package com.company.core.service;

import java.util.List;
import java.util.Optional;

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
	
	
	public String MakeABorrow(User borrower,List<Item>items)  {
		

		List<Borrow> emprunt=borrowRepository.findByBorrower(borrower);
		
		int a=items.size();
		int b=emprunt.size();
		
		
		
	return null;
	}
	
	
}
