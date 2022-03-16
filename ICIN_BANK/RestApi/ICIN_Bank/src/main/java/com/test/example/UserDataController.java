package com.test.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserDataController {
	
	@Autowired
	public UserDataRepository myrepo;
	
	
	//get current date and time
	public String getCurrentDate(){
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String currentdate = formatter.format(date);
		return currentdate;
		
	}
	
	
	//for creating user account
	@PostMapping("/register")
	public void registerItems(@RequestBody UserData data) {
		myrepo.save(data);
		String x = data.getUsername();
		System.out.println(x);
		UserData dat = myrepo.findByNames(x);
		dat.setDepositdate(this.getCurrentDate());
		dat.setStatus(1);
		dat.setBalance(0);
		dat.setWithdrawamount(0);
		dat.setWithdrawdate(" ");
		dat.setSavingbalance(0);
		dat.setTransferamount(0);
		dat.setTransferdate(" ");
		dat.setRecipientname(" ");
		myrepo.save(dat);
		
	}
	
	//user login
//	@GetMapping("/byname/{name}")
//	public List<UserData> getByName(@PathVariable("name") String name){
//		return myrepo.findByName(name);
//	}
	
	@GetMapping("/byname/{name}/{password}")
	public List<UserData> getByName(@PathVariable("name") String name,@PathVariable("password") String password){
		return myrepo.findByNamess(name,password);
	}
	
	//money transfer
	@PutMapping("/transfer/{sendername}")
	public void update(@PathVariable("sendername") String sendername, @RequestBody UserData Userdetails) {
		UserData data = myrepo.findByNames(Userdetails.getUsername());
		System.out.println(data.toString());
		data.setBalance((data.getBalance())+(Userdetails.getBalance()));
		data.setDepositdate(this.getCurrentDate());
		myrepo.save(data);
		
		UserData data2 = myrepo.findByNames(sendername);
		System.out.println(data2.toString());
		data2.setBalance((data2.getBalance())-(Userdetails.getBalance()));
		data2.setDepositdate(this.getCurrentDate());
		data2.setTransferamount(Userdetails.getBalance());
		data2.setTransferdate(this.getCurrentDate());
		data2.setRecipientname(Userdetails.getUsername());
		myrepo.save(data2);

	}
	
	//withdraw amount
	@PutMapping("/withdraw/{name}")
	public void withdraw(@PathVariable("name") String name,@RequestBody UserData Userdetails) {
		UserData data = myrepo.findByNames(name);
		data.setWithdrawamount(Userdetails.getWithdrawamount());
		data.setWithdrawdate(this.getCurrentDate());
		data.setBalance((data.getBalance())-(Userdetails.getWithdrawamount()));
		myrepo.save(data);

	}
	
	///add balance
	@PutMapping("/add/{name}")
	public void addBalance(@PathVariable("name") String name, @RequestBody UserData Userdetails) {
		UserData data = myrepo.findByNames(name);
		data.setBalance((data.getBalance())+(Userdetails.getBalance()));
		data.setDepositdate(this.getCurrentDate());
		myrepo.save(data);
	}
	
	
	//transfer money from primary to saving
	@PutMapping("/betweenaccount/{name}")
	public void betweenAccount(@PathVariable("name") String name, @RequestBody UserData Userdetails ) {
		if(Userdetails.getSavingbalance() != null) {
			UserData data = myrepo.findByNames(name);
			data.setSavingbalance((data.getSavingbalance())+(Userdetails.getSavingbalance()));
			data.setBalance((data.getBalance())-(Userdetails.getSavingbalance()));
			myrepo.save(data);
		}
		if(Userdetails.getBalance() != null) {
			UserData data = myrepo.findByNames(name);
			data.setBalance((data.getBalance())+(Userdetails.getBalance()));
			data.setSavingbalance((data.getSavingbalance())-(Userdetails.getBalance()));
			myrepo.save(data);
		}
		
	}
	
	
	//transfer money from saving to primary
	@PutMapping("/savingtoprimary/{name}")
	public void betweenAccount2(@PathVariable("name") String name, @RequestBody UserData Userdetails ) {
		UserData data = myrepo.findByNames(name);
		data.setBalance((data.getBalance())+(Userdetails.getBalance()));
		data.setSavingbalance((data.getSavingbalance())-(Userdetails.getBalance()));
		myrepo.save(data);
	}
	
	
	@PutMapping("/reset")
	public void userResetpassword(@RequestBody UserData Userdetails) {
		UserData data = myrepo.findByNames(Userdetails.getUsername());
		data.setUsername(Userdetails.getUsername());
		data.setPassword(Userdetails.getPassword());
		myrepo.save(data);
	}
	
	
	@GetMapping("/allaccount")
	public List<UserData> getAllAccount(){
		return myrepo.findAll();
	}
	
	@PutMapping("/status/{name}")
	public void setStatus(@PathVariable("name") String name, @RequestBody UserData Userdetails) {
		UserData data = myrepo.findByNames(name);
		data.setStatus(Userdetails.getStatus());
		myrepo.save(data);
	}
}
