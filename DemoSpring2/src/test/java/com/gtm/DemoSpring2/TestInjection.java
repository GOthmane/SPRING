package com.gtm.DemoSpring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

	public static void main(String[] args) {
		
		//1- Chargement du container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spectacle.xml");
		//2- Récupération d'un bean
		Performeur olivier = (Performeur) appContext.getBean("olivier");
		Performeur caroline = (Performeur) appContext.getBean("caroline");
		Performeur jeanMarc = (Performeur) appContext.getBean("jeanMarc");
		Performeur julien =  (Performeur) appContext.getBean("julien");
		Performeur alain = (Performeur) appContext.getBean("alain");
		Performeur louis = (Performeur) appContext.getBean("louis");
		Performeur michel = (Performeur) appContext.getBean("michel");
		Performeur maurice = (Performeur) appContext.getBean("maurice");
		Performeur martin = (Performeur) appContext.getBean("martin");
		Performeur monMusicien = (Performeur) appContext.getBean("monMusicien");
		//3- Traitement
		System.out.println("----------------OLIVIER----------------");
		olivier.performe();
		System.out.println("----------------CAROLINE----------------");
		caroline.performe();
		System.out.println("----------------JEAN-MARC----------------");
		jeanMarc.performe();
		System.out.println("----------------JULIEN----------------");
		julien.performe();
		System.out.println("----------------ALAIN----------------");
		alain.performe();
		System.out.println("----------------LOUIS----------------");
		louis.performe();
		System.out.println("----------------MICHEL----------------");
		michel.performe();
		System.out.println("----------------MAURICE----------------");
		maurice.performe();
		System.out.println("----------------MARTIN----------------");
		martin.performe();
		System.out.println("----------------MON MUSICIEN----------------");
		monMusicien.performe();
		//4- Destruction du container
		appContext.close();
	}

}