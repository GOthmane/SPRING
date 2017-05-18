package com.gtm.DemoSpring2.intercepteurs;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Spectateurs2 {

	public Spectateurs2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Pointcut("execution(* *.performe(..))")
	public void performance() {}
	
	@Before("performance()")
	public void prendPlace() {
		System.out.println("Les spectateurs prennent place 2");
	}
	@Before("performance()")
	public void eteintTelephonePortable() {
		System.out.println("Les spectateurs éteignent leurs téléphones portables");
	}
	@AfterReturning("performance()")
	public void applaudit(){
		System.out.println("Les spectateurs applaudissent 2");
	}
	@AfterThrowing("performance()")
	public void demandeRemboursement(){
		System.out.println("Remboursez !");
	}

}
