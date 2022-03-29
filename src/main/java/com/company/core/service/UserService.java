package com.company.core.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.hibernate.LazyInitializationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.core.entity.User;
import com.company.core.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	

	public List<User> findAllUsers() throws LazyInitializationException{
		return userRepository.findAll();
	}
	

	public void addUsers(User user) {
		userRepository.save(user);
	}
	

	
	public void updateUser (Long id, User user) {
		userRepository.save(user);
	}
	

	
	public User getUserId(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such User"));}

	
}
