package com.gtm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.dao.StockRepository;
import com.gtm.metier.Stock;
import com.gtm.service.exceptions.ArticleNotFoundException;
import com.gtm.service.exceptions.NotEnoughArticlesException;
import com.gtm.service.exceptions.QteNegativeException;

@Service
public class ServiceImpl implements IService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public void ajouter(Stock s) {
		stockRepository.save(s);
	}
	
	@Override
	public void sortArticleDuStock(int id, int qte)
			throws ArticleNotFoundException, QteNegativeException, NotEnoughArticlesException {
		if (qte < 0) {
			throw new QteNegativeException();
		}
		if (!stockRepository.exists(id)) {
			throw new ArticleNotFoundException();
		}
		if (stockRepository.findOne(id).getQuantite() < qte) {
			throw new NotEnoughArticlesException();
		}
		stockRepository.sortArticleDuStock(id, qte);
	}

	@Override
	public int getQteEnStock(int id) throws ArticleNotFoundException {
		if(!stockRepository.exists(id)){
			throw new ArticleNotFoundException();
		}
		return stockRepository.findOne(id).getQuantite();
	}

}
