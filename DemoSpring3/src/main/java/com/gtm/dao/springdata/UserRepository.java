package com.gtm.dao.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gtm.metier.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findFirstByNom(String nom);
	
	//public List<User> FindByNomContaining(String nom);
	
	@Query("SELECT u FROM User u WHERE u.nom LIKE %?1%")
	public List<User> findByMC(String mc);

}
