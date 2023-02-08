package com.eunocompany.test.ditest;

public class Address {

	private String address;
	private String phone;
	private String email;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String address, String phone, String email) {
		super();
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
