package com.mazher.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	
	
	@Autowired
	private ProductRepo myRepo;
	
	
	
	public boolean update(Product p1) {
		myRepo.save(p1);
		return true;
	}

	
	public Product getById(Integer id) {
		Product depDB = myRepo.findById(id).get();
		return depDB;
		
		
	}

}
