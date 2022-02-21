package com.mazher.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@GetMapping("/search")
	public String feedback() {
		return "search";
	}
	
	@GetMapping("/update")
	public String feedback2() {
		return "edit";
	}
	
	
	@PostMapping("/update")
	public String updatePro(Model model,@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("stock") Integer stock,@RequestParam("price") Integer price) {
		Product p1 = new Product();
		p1.setId(id);
		p1.setName(name);
		p1.setStock(stock);
		p1.setPrice(price);
		boolean data = service.update(p1);
		if(data) {
			model.addAttribute("status"," Data Update Successfully");
	        return "search";
		}else {
			model.addAttribute("statuss"," Data Not Update");
	        return "search";
		}
	}
	

	
	 @PostMapping("/search")
	 public String viewHomePage(Model model,@RequestParam("id") Integer id){
	 	
	 	try {
	 		List<Product> list = new ArrayList<>(Arrays.asList(service.getById(id)));
	 		model.addAttribute("list", list); 
		 	return "list";
	 	}catch(NoSuchElementException e) {
	 		model.addAttribute("error", "Id Not found, please enter another Id");
	        return "search";
	 	}
	 		
	 	
	 	
	 	
	  
	   
	 }
	
}
