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
		user.setNom("testJPA");
		user.setPrenom("testJPA");
//		user2.setNom("nom2");
//		user2.setPrenom("prenom2");
		service.ajouterUser(user);
//		service.ajouterUser(user2);
		System.out.println(service.listerUsers());
//		service.supprimerUser(7);
		System.out.println(service.listerParMC("om"));
		System.out.println(service.listerParNom("nom"));
		//4- Destruction du container
		appContext.close();
	}

}
