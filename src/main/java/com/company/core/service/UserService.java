package com.company.core.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.core.entity.User;
import com.company.core.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	// Lecture de la liste des Users

	
	// Creation d'un User
	public void addUsers(User user) {
		userRepository.save(user);
	}
	
	// Update le User
	
	public void updateUser (Long id, User user) {
		userRepository.save(user);
	}
	
	// Lecture d'un User 
	
	public User getItem(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such User"));}

	
}
