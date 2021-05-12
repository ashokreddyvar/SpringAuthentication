package com.ojas.pojos;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class User_Details {
	@Id
	 private long userId;
	 private String userName;
	 private String password;
	public User_Details() {
		super();
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
