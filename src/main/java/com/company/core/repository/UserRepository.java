package com.company.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.core.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public List<User> findByLogin(String login);
	
	public Optional<User> findById(Long id);
}