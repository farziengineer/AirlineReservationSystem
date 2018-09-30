package com.nissan.corejava.project.pojo;

public class Customer extends User{

	
	public Customer(String name, String email, String password, String dob, String contact) {
		super(name, email, password, dob, contact);
	}
	
	public Customer(int id, String name, String email, String password, String dob, String contact) {
		super(id, name, email, password, dob, contact);
	}
	
}
