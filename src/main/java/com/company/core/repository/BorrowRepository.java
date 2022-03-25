package com.company.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.core.entity.Borrow;
import com.company.core.entity.Copie;
import com.company.core.entity.User;

public interface BorrowRepository extends JpaRepository<Borrow, Long>{
	
	// identification de la liste d'emprunt  d'un user particulier
	public List<Borrow> findByBorrower(User borrower);
	
	// identification de la liste d'emprunt d'un exemplaire
	public List<Borrow> findByCopie (Copie copie);
	
	// identification d'un emprunt par son id
	public Optional<Borrow> findById(Long id);
	
	 
	
}
