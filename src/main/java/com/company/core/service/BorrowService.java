package com.company.core.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		// verifier condition quta utilisateur

		borrower = userRepository.findById(borrower.getId())
				.orElseThrow(() -> new EntityNotFoundException("No such User"));
		int emprunt = borrower.getBorrowedItems().size();

		if (emprunt + items.size() > 3) {
			throw new QuotasExceedException();
		}

		// dispo des copis sinon exception
		List<Copie> copiefound = new ArrayList<>();
		for (Item item : items) {
			List<Copie> copieDispo = copieRepository.copiedispo(item);

			if (copieDispo.size() == 0) {
				throw new AvailableCopieException(); // creer une autre exception
				// si oui creation un borrow
			} else {
				copiefound.add(copieDispo.get(0));

			}
		}

		// affiche la date de retour + indication dela reservation
		Borrow reservation=new Borrow();
		reservation.setCopie(copiefound);
		reservation.setBorrower(borrower);
		reservation.setStartDate(LocalDateTime.now());
		reservation.setEndDate(LocalDateTime.now().plusDays(7));
		borrowRepository.save(reservation);
		
		return reservation;
	}

	public Borrow ReturnABorrow(User borrower, List<Borrow> returns){
		
		//identification du borrower
		borrower = userRepository.findById(borrower.getId())
				.orElseThrow(() -> new EntityNotFoundException("No such User"));
		// l'ensemble des borrows empruntés par le borrower
		returned = borrower.getBorrowedItems();
		
		// pour l'ensemble des copies retournées 
		for(Borrow borrow:borrow) {
			List<Copie> copieReturn = copieRepository.
		}
		
		
		
		
	return	
	}
	
	
	
	
	
	
	
	
}

