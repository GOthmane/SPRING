package com.gtm.service;

import com.gtm.metier.Stock;
import com.gtm.service.exceptions.ArticleNotFoundException;
import com.gtm.service.exceptions.NotEnoughArticlesException;
import com.gtm.service.exceptions.QteNegativeException;

public interface IService {
	
	public void ajouter(Stock s);
	
	public void sortArticleDuStock(int id, int qte) throws ArticleNotFoundException, QteNegativeException, NotEnoughArticlesException;
	public int getQteEnStock(int id) throws ArticleNotFoundException;

}
