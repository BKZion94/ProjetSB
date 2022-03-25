package com.company.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.core.entity.Borrow;
import com.company.core.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	// Identification de l'utilisateur par son id
	public Optional<User> findById(Long id);
	
	// Trouver un utilisateur par son prénom
	public Optional<User> findByFirstName(String firstName);
	
	// Trouver un utilisateur par son nom
	public Optional<User> findByLastName(String lastName);
	
	// Trouver un utilisateur en fonction d'un emprunt
	public Optional<User> findByBorrowedItems(Borrow borrowedItems);
}
