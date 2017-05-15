package com.gtm.DemoSpring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

	public static void main(String[] args) {
		
		//1- Chargement du container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2- Récupération d'un bean
		SocieteDevLogiciel societe = (SocieteDevLogiciel) appContext.getBean("societe");
		//3- Traitement
		System.out.println(societe);
		//4- Destruction du container
		appContext.close();
	}

}
