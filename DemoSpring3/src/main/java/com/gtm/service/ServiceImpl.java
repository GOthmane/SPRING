package com.gtm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gtm.metier.User;

@Service
public class ServiceImpl implements IService {

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> listerUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerUser(long id) {
		// TODO Auto-generated method stub

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
