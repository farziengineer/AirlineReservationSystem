package com.nissan.corejava.project.utilities;

import java.util.Scanner;

abstract public class Register {
	int id;
	String name;
	String email;
	String password;
	String dob;
	String contact;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	

	public void inputDetails() {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Name");
		name = input.nextLine();
		System.out.println("Email");
		password = input.nextLine();
		System.out.println("Password");
		password = input.nextLine();
		System.out.println("Date of Birth");
		dob = input.nextLine();
		System.out.println("Contact");
		contact = input.nextLine();
	}
	
	abstract public int register();
	
}