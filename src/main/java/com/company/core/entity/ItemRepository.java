package com.company.core.entity;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ItemRepository extends JpaRepository<Item, Long>{

	
	//@Query("select i from Item i left join fetch i.dvd where i.id=:id")
	//public List<Item> fullDvdItem(@Param("id") Long id);
	
	//@Query("select i from Item i left join fetch i.book where i.id=:id")
	//public List<Item> fullBookItem(@Param("id") Long id);
	
	
	//public List<Item> findByIntegration(Date integration);
	

	public Optional<Item> findById(Long id);
	
	public List<Item> findByIntegration(Date integration);

	@Query("from Cd")
	public List<Cd> findAllCd();

	@Query("from Dvd")
	public List<Dvd> findAllDvd();
	
	@Query("from Book")
	public List<Book> findAllBook();
	
}
