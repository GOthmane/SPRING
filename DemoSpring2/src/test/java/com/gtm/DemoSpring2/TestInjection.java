package com.gtm.DemoSpring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

	public static void main(String[] args) {
		
		//1- Chargement du container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spectacle.xml");
		//2- Récupération d'un bean
		Musicien olivier = (Musicien) appContext.getBean("olivier");
		//3- Traitement
		System.out.println(olivier);
		//4- Destruction du container
		appContext.close();
	}

}