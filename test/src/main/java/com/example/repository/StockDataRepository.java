package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.StockData;

public interface StockDataRepository extends JpaRepository<StockData,Integer> {
}
