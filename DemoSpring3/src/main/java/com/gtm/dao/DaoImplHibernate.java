package com.gtm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.metier.User;

@Transactional
@Repository
public class DaoImplHibernate implements IDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void ajouterUser(User u) {
		getSession().save(u);
	}

	@Override
	public List<User> listerUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerUser(long id) {
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
	public List<User> listerParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
