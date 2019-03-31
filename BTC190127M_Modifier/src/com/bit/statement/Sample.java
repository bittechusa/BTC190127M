package com.bit.statement;

public class Sample {
	
	private String userName = "abcd";
	private String password = "Xyz";
	private int zipCode = 1223;
	
	//get means read
	public String getUserName() {
		return userName;
	}
	//set means write
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	//U can overload but can't override 
	private void abv() {
		
	}
	
	
	

}
