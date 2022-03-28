package com.company.core.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.core.controller.ItemNotFoundException;
import com.company.core.entity.Borrow;
import com.company.core.entity.Copie;
import com.company.core.entity.Item;
import com.company.core.entity.User;
import com.company.core.repository.BorrowRepository;
import com.company.core.repository.CopieRepository;
import com.company.core.repository.ItemRepository;
import com.company.core.repository.UserRepository;

@Service
@Transactional

public class BorrowService {

	@Autowired
	BorrowRepository borrowRepository;
	@Autowired
	CopieRepository copieRepository;
	@Autowired
	ItemRepository itemRepository;
	@Autowired
	UserRepository userRepository;

	public Borrow makeABorrow(User borrower, List<Item> items) throws AvailableCopieException, QuotasExceedException {

		borrower = userRepository.findById(borrower.getId()).orElseThrow(() -> new EntityNotFoundException("No such User"));

		int emprunt = borrower.getBorrowedItems().size();

		if (emprunt + items.size() > 3) {
			throw new QuotasExceedException();
		}

		List<Copie> copiefound = new ArrayList<>();

		for (Item item : items) {
			List<Copie> copieDispo = copieRepository.copiedispo(item); 

			if (copieDispo.size() == 0) {
				throw new AvailableCopieException(); 

			} else {
				copiefound.add(copieDispo.get(0));

			}
		}

		Borrow reservation=new Borrow();
		reservation.setCopie(copiefound);
		reservation.setBorrower(borrower);
		reservation.setStartDate(LocalDateTime.now());
		reservation.setEndDate(LocalDateTime.now().plusDays(7));
		borrowRepository.save(reservation);

		return reservation;
	}



	public Borrow returnABorrow(Borrow borrow) throws DepassementException, ItemNotFoundException{

		borrow=borrowRepository.findById(borrow.getId()).orElseThrow(() -> new ItemNotFoundException("No such borrow")); 

		List<Copie> copis = borrow.getCopie();

		for (Iterator<Copie> iterator = copis.iterator(); iterator.hasNext();) {
			Copie copie = iterator.next();
			if(copie.getId()==copie.getId()) {
				iterator.remove();	
			} 
		
		}
		
		LocalDateTime startDate=borrow.getStartDate();
		LocalDateTime endDate = borrow.getEndDate();
		long differenceInDays = ChronoUnit.DAYS.between(startDate,endDate);
		
		if (differenceInDays>7) {
			throw new DepassementException();
		}
		
		
		return borrow;
	}

	
	// Visualiser les emprunts
	
	public List<Borrow> findAllBorrow(){
		return borrowRepository.findAll();
	}
	
	

	
	
	
	
	
}

