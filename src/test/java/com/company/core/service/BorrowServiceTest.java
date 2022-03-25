package com.company.core.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.company.core.entity.Copie;
import com.company.core.entity.Item;
import com.company.core.entity.User;



@DataJpaTest
public class BorrowServiceTest {
	
	
	@Autowired
	BorrowService borrowService;
	
	@Test
	public void testMakeABorrow() throws AvailableCopieException, QuotasExceedException {
		
		User borrower = new User();
		borrower.setId(1l);
		
		List <Item> item=new ArrayList<>();
		item.get(1);
		
		borrowService.makeABorrow(borrower, item);
		
	}


	
}