package com.company.core.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CdInterface extends JpaRepository<Cd, Long>{

	Optional<Cd> findByTitle(String title);
	
	Optional<Cd> findByArtist(String artist);
	
	

}
