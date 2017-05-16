package com.gtm.DemoSpring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gtm.metier.User;
import com.gtm.service.IService;

public class Lanceur {

	public static void main(String[] args) {
		//1- Chargement du container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2- Récupération des beans
		User user = (User) appContext.getBean("user");
		User user2 = (User) appContext.getBean("user");
		IService service = (IService) appContext.getBean("serviceImpl");
		//3- Traitement
		user.setNom("toto");
		System.out.println("nom user = "+user.getNom());
		System.out.println("nom user2 = "+user2.getNom());
		service.ajouterUser(user);
		//4- Destruction du container
		appContext.close();
	}

}
