package com.company.core.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.company.core.entity.Borrow;
import com.company.core.entity.Copie;
import com.company.core.entity.Item;
import com.company.core.entity.User;

@DataJpaTest
public class BorrowRepositoryTest {

	@Autowired
	BorrowRepository borrowRepository;
	
	@Autowired
	CopieRepository copieRepository;
	
	@Test
	public void testVisuEmprunt() {
		User user=new User();
		user.setId(1L);
		
		List<Borrow> borrows =borrowRepository.findByBorrower(user);
		
		assertTrue(borrows.size()==1);
	}
	
	
	@Test
	public void testFindDispo() {
		Item item=new Item();
		item.setId(1l);
		
		List<Copie> copies =copieRepository.copiedispo(item);
		
		assertTrue(copies.size()==1);
	}
	
}
