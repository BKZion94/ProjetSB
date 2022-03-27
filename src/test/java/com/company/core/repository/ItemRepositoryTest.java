package com.company.core.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.core.entity.Cd;

@SpringBootTest
public class ItemRepositoryTest {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Test
	void TestCdByArtistNotIgnoringCase() {
		// Indique si la méthode prend en compte les carcatères et une partie du nom 
		Optional<Cd> found = itemRepository.findByArtistContainsIgnoreCase("Kanye West");
		assertTrue(found.isPresent());
		
		Optional<Cd> notfound = itemRepository.findByArtistContainsIgnoreCase("KANye");
		assertTrue(notfound.isPresent());
		
		
	}
}
