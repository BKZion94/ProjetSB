package com.company.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.core.entity.Item;
import com.company.core.entity.User;
import com.company.core.service.ItemsService;
import com.company.core.service.UserNotFoundException;
import com.company.core.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	

	UserService userService;
	
	public UserRestController(UserService userService) {
		this.userService=userService;
	}
	
	//@GetMapping
	//@JsonView(ItemViews.List.Class)
	//public List<User> findAllUsers() throws UserNotFoundException{
		//return userService.getitem();
	//}
	
	
	
	
	
	
}
