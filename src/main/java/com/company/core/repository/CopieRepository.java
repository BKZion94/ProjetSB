package com.company.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.company.core.entity.Copie;
import com.company.core.entity.Item;

public interface CopieRepository extends JpaRepository<Copie, Long> {
	
	//Trouver une copie par le biais de son item
	public Optional<Copie> findById(Long id);
	
	//Lister les copies liée à un item
	public List<Copie> findByItem(Item item);
	
	@Query("select c from Copie c WHERE c.item = :item AND c.id NOT IN (select c2.id from Copie c2 where c2.borrow is null)")
	public List<Copie> copiedispo(Item item);

}
