package com.company.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.company.core.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	// Identification de l'utilisateur par son id
	public List<User> findByLogin(String login);
	
	public Optional<User> findById(Long id);
}