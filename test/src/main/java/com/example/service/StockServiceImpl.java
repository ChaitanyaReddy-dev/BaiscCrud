package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.StockException;
import com.example.model.StockData;
import com.example.repository.StockDataRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	StockDataRepository stockDataRepository;

	@Override
	public String createStock(StockData data) {
		stockDataRepository.save(data);
		System.out.println("creating record in database");
		return "saved";

	}

	@Override
	public StockData getStockData(int id) {
		System.out.println("fetching record from database");
		StockData stockData = stockDataRepository.findById(id).get();
		return stockData;

	}

	@Override
	public int updateStock(StockData data) {

		stockDataRepository.save(data);
		return 1;

	}

	@Override
	public Boolean CancelStock(int id) throws StockException {
		try {
			StockData data = stockDataRepository.findById(id).orElse(null);
			if (data == null) {
				throw new NullPointerException();
			}
			data.setPrice("0");
			int i = updateStock(data);
			if (i == 0) {
				return false;
			}

		} catch (NullPointerException e) {
			throw new StockException();
		}

		return true;

	}

}
