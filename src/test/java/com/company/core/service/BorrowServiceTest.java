package com.company.core.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.core.entity.Borrow;
import com.company.core.entity.Copie;
import com.company.core.entity.Item;
import com.company.core.entity.User;



@SpringBootTest
public class BorrowServiceTest {
	
	
	@Autowired
	BorrowService borrowService;
	
	@Test
	public void WhenUserTestMakeABorrowCheckIfHeCan() throws AvailableCopieException, QuotasExceedException {
		
		// Creation d'un borrower
		User borrower = new User();
		borrower.setId(1l);
		
		//Creation list Item emrounté
		List<Item> items = new ArrayList<>();
		Item item2 = new Item();
		item2.setId(2l);
		Item item3 = new Item();
		item3.setId(3L);
		
		items.add(item3);
		items.add(item2);
	
		Borrow borrow=borrowService.makeABorrow(borrower, items);
		
		assertNotNull(borrow.getId());
		assertEquals(2,borrow.getCopie().size());
		
	}
	
	@Test
	public void CheckIfTheListOfCopiesBorrowedAreEmpty() throws AvailableCopieException, QuotasExceedException, DepassementException {
		// Ce test indique si une copie est réelement rendu lors d'un retour d'emprunt
		Borrow borrow = new Borrow();
		borrow.setId(1L);
		borrow.setEndDate(LocalDateTime.of(2022, 03, 26, 20, 20));
		borrow.setStartDate(LocalDateTime.of(2022,03,24,1,1));
		
		LocalDateTime a=borrow.getStartDate();
		LocalDateTime b=borrow.getEndDate();
		
		long differenceInDays = ChronoUnit.DAYS.between(a,b);
		
		List<Copie> copieList = new ArrayList<>();
		Copie copie =new Copie();
		copie.setId(2L);
		
		
		copieList.add(copie);
		
		
		borrow.setCopie(copieList);
		
		Borrow borrow1=borrowService.returnABorrow(borrow);
		
		assertEquals(0,borrow1.getCopie().size()); 
													// OK les copies liées à un borrow sont inexistants
		assertThat(differenceInDays).isLessThan(8); // Non dépassement du quota de prêt
	}

	


}