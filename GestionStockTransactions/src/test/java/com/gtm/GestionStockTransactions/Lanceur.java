package com.gtm.GestionStockTransactions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gtm.metier.Stock;
import com.gtm.service.IService;
import com.gtm.service.exceptions.ArticleNotFoundException;
import com.gtm.service.exceptions.NotEnoughArticlesException;
import com.gtm.service.exceptions.QteNegativeException;

public class Lanceur {

	public static void main(String[] args) {
		// 1- Chargement du container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2- Récupération des beans
		IService service = (IService) appContext.getBean("serviceImpl");
		Stock s = (Stock) appContext.getBean("stock");
		s.setNom("Claviers");
		s.setQuantite(10);
		//service.ajouter(s);
		try {
			service.sortArticleDuStock(1, 5);
		} catch (ArticleNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (QteNegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotEnoughArticlesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
