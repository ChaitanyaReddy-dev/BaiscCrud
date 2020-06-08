package com.example.service;


import com.example.Exception.StockException;
import com.example.model.StockData;


public interface StockService {
	
	public String createStock(StockData data);
	
	public StockData getStockData(int id);
	
	public int updateStock(StockData data);
	
	public Boolean CancelStock(int id) throws StockException;
	

}
