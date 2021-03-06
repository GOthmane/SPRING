package com.gtm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.metier.Stock;

@Transactional
public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	@Modifying
	@Query("UPDATE Stock s SET s.quantite=s.quantite-?2 WHERE s.id= ?1")
	public void sortArticleDuStock(int id, int qte);	

}
