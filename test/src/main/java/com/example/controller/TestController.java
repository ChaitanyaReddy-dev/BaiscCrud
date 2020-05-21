package com.example.controller;

import com.example.model.StockData;
import com.example.repository.StockDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/stock")
public class TestController {

    @Autowired
    StockDataRepository stockDataRepository;

    @PostMapping("/data")
    public void postData(@RequestBody StockData stockData){

        stockDataRepository.save(stockData);



    }
    @GetMapping("/getdata/{id}")
    public Optional<StockData> getData(@PathVariable int id){
        System.out.println("test");
       return  stockDataRepository.findById(id);
    }
    @DeleteMapping("deletedata/{id}")
    public void deleteData(@PathVariable int id){
    stockDataRepository.deleteById(id);
    }
    @PostMapping
    public void updateData(){

    }
}
