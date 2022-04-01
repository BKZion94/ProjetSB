package com.company.core.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.core.entity.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
	

	@Query("from Cd")
	public List<Item> findAllCd();

	
	@Query("from Dvd")
	public List<Item> findAllDvd();

	@Query("from Book")
	public List<Item> findAllBook();

	
	public List<Item> findByIntegration(LocalDate integration);
	
}
