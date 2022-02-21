package com.mazher.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_tbl")
public class Product {
	
	
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;
	
	@Column
	private Integer stock;
	
	@Column
	private Integer price;
	
	
	Product(){
		
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", stock=" + stock + ", price=" + price + "]";
	}

	public Product(Integer id, String name, Integer stock, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.price = price;
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	
	
	
}
