package com.example.productdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private double price;
	public Product() {}
	Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	@Override
    public String toString() {
        return "id= " + id +
               " name= " + name +
               " price= " + price + " ";
    }
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
