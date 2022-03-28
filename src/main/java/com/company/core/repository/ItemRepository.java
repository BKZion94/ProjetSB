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
	
	
	// CD Section
		//**Get list all Cd by Artist 
	@Query("from Cd")
	public List<Cd> findAllCd();
		//** Get Cd by the artist name

	

	
	// DVD section
	@Query("from Dvd")
	public List<Dvd> findAllDvd();
		//** Get Dvd by Director 
	public Optional<Dvd> findByDirectorContainsIgnoreCase(String director);


	
	// Book section 
	@Query("from Book")
	public List<Book> findAllBook();
		//** Get Book by Author
	public Optional<Book> findByAuthorContainsIgnoreCase(String author);
	






	
	
	
	
	
	
	
}
