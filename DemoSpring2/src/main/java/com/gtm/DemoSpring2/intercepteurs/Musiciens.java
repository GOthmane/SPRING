package com.gtm.DemoSpring2.intercepteurs;

import org.aspectj.lang.ProceedingJoinPoint;

public class Musiciens {

	public Musiciens() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Méthode d'aspect around sans appeler la méthode cible
//	public void jeJoue(){
//		System.out.println("Je joue");
//	}
	
	// Méthode d'aspect around avec appel de la méthode cible
	public Object jeJoue(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Je joue");
		return pjp.proceed();
	}

}
