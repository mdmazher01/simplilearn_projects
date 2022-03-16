package com.test.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	private AdminRepository adminrepo;
	
	
	//admin login
	@GetMapping("/admin")
	public List<AdminData> getAdmin(){
		return adminrepo.findAll();
	}
	
	
	@PutMapping("/admin/reset")
	public void getAdminReset(@RequestBody AdminData admin) {
		AdminData dat = adminrepo.findByNames(admin.getName());
		dat.setName(admin.getName());
		dat.setPassword(admin.getPassword());
		adminrepo.save(dat);
		
	}
}
