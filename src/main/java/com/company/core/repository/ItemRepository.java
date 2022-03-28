package com.company.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.company.core.entity.Book;
import com.company.core.entity.Cd;
import com.company.core.entity.Dvd;
import com.company.core.entity.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
	

	@Query("from Cd")
	public List<Cd> findAllCd();

	
	@Query("from Dvd")
	public List<Dvd> findAllDvd();

	@Query("from Book")
	public List<Book> findAllBook();

	






	
	
	
	
	
	
	
}
