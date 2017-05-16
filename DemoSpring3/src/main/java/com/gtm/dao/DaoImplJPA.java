package com.gtm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.metier.User;

@Transactional
@Repository
public class DaoImplJPA implements IDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ajouterUser(User u) {
		entityManager.persist(u);
	}

	@Override
	public List<User> listerUsers() {
		String req = "FROM User";
		Query query = (Query) entityManager.createQuery(req);
		return query.getResultList();
	}

	@Override
	public void supprimerUser(long id) {
		entityManager.remove(entityManager.find(User.class,id));
	}

	@Override
	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User listerParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
