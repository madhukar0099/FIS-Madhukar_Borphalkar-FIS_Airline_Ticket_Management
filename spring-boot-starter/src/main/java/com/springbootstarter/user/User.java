package com.springbootstarter.user;

public class User {

	private int ID;
	private String name;
	private long contactNo;
	private String mail;
	private String address;
	private String password;
	
	public User() {
		
	}
	
	public User(int iD, String name, long contactNo, String mail, String address, String password) {
		super();
		ID = iD;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.password = password;
		this.mail = mail;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
