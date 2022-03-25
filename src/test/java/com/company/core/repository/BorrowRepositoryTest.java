package com.company.core.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.company.core.entity.Borrow;
import com.company.core.entity.User;
import com.company.core.repository.BorrowRepository;

@DataJpaTest
public class BorrowRepositoryTest {

	@Autowired
	BorrowRepository borrowRepository;
	
	@Test
	public void testVisuEmprunt() {
		User user=new User();
		user.setId(1L);
		
		List<Borrow> borrows =borrowRepository.findByBorrower(user);
		
		assertTrue(borrows.size()==1);
	}
	
	
}
