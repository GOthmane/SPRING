package com.gtm.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtm.metier.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
