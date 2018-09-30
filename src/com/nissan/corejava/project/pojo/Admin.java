package com.nissan.corejava.project.pojo;

public class Admin extends User{

	public Admin(String name, String email, String password, String dob, String contact) {
		super(name, email, password, dob, contact);
	}
	
	public Admin(int id, String name, String email, String password, String dob, String contact) {
		super(id, name, email, password, dob, contact);
	}

}
