package com.gtm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
		String req = "FROM User";
		Query query = getSession().createQuery(req);
		return query.list();
	}

	@Override
	public void supprimerUser(long id) {
		getSession().delete(trouverUser(id));
	}

	@Override
	public User trouverUser(long id) {
		return getSession().get(User.class,id);
	}

	@Override
	public List<User> listerParMC(String nom) {
		String req = "FROM User as u WHERE u.nom LIKE :leNom";
		Query query = getSession().createQuery(req);
		query.setParameter("leNom", "%nom%");
		return query.list();
	}

	@Override
	public User listerParNom(String nom) {
		String req = "FROM User as u WHERE u.nom LIKE :leNom";
		Query query = getSession().createQuery(req);
		query.setParameter("leNom", nom);
		// un resultat au maximum pour la requete
		// sinon erreur avec uniqueResult() lorsqu'il
		// y a plusieurs resultats
		query.setMaxResults(1);
		return (User) query.uniqueResult();
	}

}
