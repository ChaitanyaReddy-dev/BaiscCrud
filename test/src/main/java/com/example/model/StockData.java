package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@RedisHash
@Entity
@Table(name = "Stock")
public class StockData implements Serializable{

    
	/**
	 * 
	 */

	@Id
    private  int id;
    private String name;
    private String price;

    public StockData() {
		super();
	}

	public StockData(int id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

	@Override
	public String toString() {
		return "StockData [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
