package com.example.service;

/*import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Exception.StockException;
import com.example.model.StockData;
import com.example.repository.StockDataRepository;*/

public class StockServiceImplTest {
	
/*	@Mock
	StockDataRepository stockDataRepository;
	
	@Autowired
	@InjectMocks
	private StockServiceImpl stockServiceImpl;

	@Before
	public void  setup() {
		
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void  testCreateStock() {
		
		StockData data=new StockData();
		data.setId(1);
		data.setName("starbucks");
		data.setPrice("E1234567");
		stockServiceImpl.createStock(data);
		verify(stockDataRepository).save(data);

	}
	
	@Test
	public void testgetStock() {
		
		
		StockData data=new StockData();
		data.setId(1);
		data.setName("starbucks");
		data.setPrice("E1234567");
		int id=1;
	  
		when(stockDataRepository.findById(id)).thenReturn(Optional.of(data));
		StockData price=stockServiceImpl.getStockData(id);
		
		Assert.assertEquals("starbucks",price.getName());
		Assert.assertEquals("E1234567",price.getPrice());
		verify(stockDataRepository).findById(id);
		
		
		
		
	}
	@Test
	public void testUpdate() throws StockException {
		
		
		when(stockDataRepository.findById(1)).thenReturn(Optional.of(new StockData(1,"kfc","123")));
		
		Assert.assertEquals(true,stockServiceImpl.CancelStock(1));
	}
	
	
	@Test(expected=StockException.class)
	public void testUpdateException() throws StockException {
		
		
		when(stockDataRepository.findById(1)).thenThrow(NullPointerException.class);
		stockServiceImpl.CancelStock(1);
		
		
		
	}
	
	
*/
}
