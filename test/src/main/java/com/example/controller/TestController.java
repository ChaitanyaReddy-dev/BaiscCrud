package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StockData;
import com.example.service.StockService;

@RestController
@RequestMapping("/stock")
public class TestController {

	@Autowired
	StockService stockService;

	@CachePut(value = "stockdata")
	@PostMapping("/data")
	public void postData(@RequestBody StockData stockData) {
		System.out.println("calling service layer for daving record");
		stockService.createStock(stockData);

	}

	@Cacheable(value = "stock", key = "#id")
	@GetMapping("/getdata/{id}")
	@ResponseBody
	public StockData getData(@PathVariable int id) {

		System.out.println("fetching record from service layer");
		return stockService.getStockData(id);

	}

}
