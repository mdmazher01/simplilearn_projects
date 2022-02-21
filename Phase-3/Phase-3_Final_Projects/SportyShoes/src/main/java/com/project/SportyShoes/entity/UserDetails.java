package com.project.SportyShoes.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "userdetails")
@Table(name="userdetails")
public class UserDetails{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public long userId;
	public String username;
	public String emailId;
	public String phone;
	public String productPerchased;
	public String perchaseDate;
	public String category;
	public String createdate;
	public String lastupdatedate;
	public UserDetails() {
		super();
	
	}
	public UserDetails(long userId, String username, String emailId, String phone, String productPerchased,
			String perchaseDate, String category,String createdate, String lastupdatedate) {
		super();
		this.userId = userId;
		this.username = username;
		this.emailId = emailId;
		this.phone = phone;
		this.productPerchased = productPerchased;
		this.perchaseDate = perchaseDate;
		this.category = category;
		this.createdate = createdate;
		this.lastupdatedate = lastupdatedate;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getLastupdatedate() {
		return lastupdatedate;
	}
	public void setLastupdatedate(String lastupdatedate) {
		this.lastupdatedate = lastupdatedate;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProductPerchased() {
		return productPerchased;
	}
	public void setProductPerchased(String productPerchased) {
		this.productPerchased = productPerchased;
	}
	public String getPerchaseDate() {
		return perchaseDate;
	}
	public void setPerchaseDate(String perchaseDate) {
		this.perchaseDate = perchaseDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", username=" + username + ", emailId=" + emailId + ", phone=" + phone
				+ ", productPerchased=" + productPerchased + ", perchaseDate=" + perchaseDate + ", category=" + category
				+ ", createdate=" + createdate + ", lastupdatedate=" + lastupdatedate + "]";
	}
	
	

}
