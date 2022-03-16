package com.test.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdata")
public class UserData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="balance")
	private Integer balance;
	
	@Column(name="depositdate")
	private String depositdate;
	
	@Column(name="withdrawamount")
	private Integer withdrawamount;
	
	@Column(name="withdrawdate")
	private String withdrawdate;
	
	@Column(name="recipientname")
	private String recipientname;
	
	@Column(name="transferamount")
	private Integer transferamount;
	
	@Column(name="transferdate")
	private String transferdate;
	
	@Column(name="savingbalance")
	private Integer savingbalance;
	
	@Column(name="status")
	private Integer status;
	
	
	

	public UserData(Long id, String username, String password, Integer balance, String depositdate,
			Integer withdrawamount, String withdrawdate, String recipientname, Integer transferamount,
			String transferdate, Integer savingbalance, Integer status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.depositdate = depositdate;
		this.withdrawamount = withdrawamount;
		this.withdrawdate = withdrawdate;
		this.recipientname = recipientname;
		this.transferamount = transferamount;
		this.transferdate = transferdate;
		this.savingbalance = savingbalance;
		this.status = status;
	}

	public UserData() {
		
	}

	

	
	
	

	@Override
	public String toString() {
		return "UserData [id=" + id + ", username=" + username + ", password=" + password + ", balance=" + balance
				+ ", depositdate=" + depositdate + ", withdrawamount=" + withdrawamount + ", withdrawdate="
				+ withdrawdate + ", recipientname=" + recipientname + ", transferamount=" + transferamount
				+ ", transferdate=" + transferdate + ", savingbalance=" + savingbalance + ", status=" + status + "]";
	}

	

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getDepositdate() {
		return depositdate;
	}

	public void setDepositdate(String depositdate) {
		this.depositdate = depositdate;
	}

	public Integer getWithdrawamount() {
		return withdrawamount;
	}

	public void setWithdrawamount(Integer withdrawamount) {
		this.withdrawamount = withdrawamount;
	}

	public String getWithdrawdate() {
		return withdrawdate;
	}

	public void setWithdrawdate(String withdrawdate) {
		this.withdrawdate = withdrawdate;
	}

	public String getRecipientname() {
		return recipientname;
	}

	public void setRecipientname(String recipientname) {
		this.recipientname = recipientname;
	}

	public Integer getTransferamount() {
		return transferamount;
	}

	public void setTransferamount(Integer transferamount) {
		this.transferamount = transferamount;
	}

	public String getTransferdate() {
		return transferdate;
	}

	public void setTransferdate(String transferdate) {
		this.transferdate = transferdate;
	}
	

	public Integer getSavingbalance() {
		return savingbalance;
	}

	public void setSavingbalance(Integer savingbalance) {
		this.savingbalance = savingbalance;
	}

	
	
	
	
	
	

}
