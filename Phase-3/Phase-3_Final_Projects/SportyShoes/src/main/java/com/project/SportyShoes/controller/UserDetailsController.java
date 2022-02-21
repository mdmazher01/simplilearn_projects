package com.project.SportyShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.SportyShoes.entity.UserDetails;
import com.project.SportyShoes.service.UserDetailsService;

@Controller
public class UserDetailsController {
	@Autowired
	UserDetailsService userservice;

	
	@GetMapping("/index")
	public String viewUserDetails(Model model)
	{
		List<UserDetails> listUsers= userservice.listAll();
		System.out.println("listUsers" + listUsers);
		model.addAttribute("listUsers",listUsers);
		return "/index";
	}
	
	

	@GetMapping("/user")
	public String getUser() {
		return "finduser";
	}
	
	@PostMapping("/user")
	public String findUserName(@RequestParam("username") String username,Model model)
	{	
		List<UserDetails> userdetails=userservice.get(username);
		if(userdetails.isEmpty()) {
			return "/usernotfound";
		}else {
			model.addAttribute("userdetails", userdetails);
			return "/userlist";
		}
		
	}
	
	
	
	

}
