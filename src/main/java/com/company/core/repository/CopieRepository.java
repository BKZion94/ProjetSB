package com.company.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.core.entity.Copie;
import com.company.core.entity.Item;

public interface CopieRepository extends JpaRepository<Copie, Long> {
	
	//Trouver une copie par le biais de son item
	public Optional<Copie> findById(Long id);
	
	//Lister les copies liée à un item
	public List<Copie> findByItem(Item item);
	
	

}
