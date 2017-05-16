package com.gtm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		return entityManager.createQuery("SELECT u FROM User u").getResultList();
	}

	@Override
	public void supprimerUser(long id) {
		entityManager.remove(entityManager.find(User.class,id));
	}

	@Override
	public User trouverUser(long id) {
		return entityManager.find(User.class,id);
	}

	@Override
	public List<User> listerParMC(String nom) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.nom LIKE :leNom");
		query.setParameter("leNom", "%nom%");
		return query.getResultList();
	}

	@Override
	public User listerParNom(String nom) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.nom=:leNom");
		query.setParameter("leNom", nom);
		query.setMaxResults(1);
		return (User) query.getSingleResult();
	}

}
