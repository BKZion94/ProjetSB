package com.company.core.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.company.core.entity.Borrow;
import com.company.core.entity.Copie;
import com.company.core.entity.User;

public interface BorrowRepository extends JpaRepository<Borrow, Long>{
	
	public List<Borrow> findByBorrower(User borrower);
	
	public List<Borrow> findByCopies (Copie copie);
	
	@Query("from Borrow")
	public List<Borrow> findAllBorrow();
	
}
