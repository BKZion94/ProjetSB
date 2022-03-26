package com.company.core.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
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

		// Retrouver le borrower dans la base de donnée
		borrower = userRepository.findById(borrower.getId()).orElseThrow(() -> new EntityNotFoundException("No such User"));

		// Trouver le nombre d'item emprunté par le borrower
		int emprunt = borrower.getBorrowedItems().size();

		// Vérification si l'emprunt du borrower et le nombre d'item à emprunter est inf à 3
		if (emprunt + items.size() > 3) {
			throw new QuotasExceedException();
		}


		List<Copie> copiefound = new ArrayList<>();

		// Pour chaque items à emprunter vérifier si dans la base de donnée c'est dispo
		for (Item item : items) {
			List<Copie> copieDispo = copieRepository.copiedispo(item);  // en reference avec le @Many to One dans la page Copie

			if (copieDispo.size() == 0) {
				throw new AvailableCopieException(); 

			} else {
				copiefound.add(copieDispo.get(0));	// si la copie est disponible ajout dans la liste prédéfinie auparavant copiefound [donc
				// les emprunts qui ont été validé

			}
		}

		// Creation de la reservation 
		Borrow reservation=new Borrow();
		reservation.setCopie(copiefound);
		reservation.setBorrower(borrower);
		reservation.setStartDate(LocalDateTime.now());
		reservation.setEndDate(LocalDateTime.now().plusDays(7));
		borrowRepository.save(reservation);

		return reservation;
	}



	public Borrow returnABorrow(Borrow borrow) {

		borrow=borrowRepository.getById(borrow.getId()); 

		List<Copie> copis = borrow.getCopie();

		for (Iterator<Copie> iterator = copis.iterator(); iterator.hasNext();) {
			Copie copie = iterator.next();
			if(copie.getId()==copie.getId()) {
				iterator.remove();	
			} 
		
		}
		
		borrowRepository.save(borrow);
		return borrow;
	}


}

