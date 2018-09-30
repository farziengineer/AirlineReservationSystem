package com.nissan.corejava.project.pojo;

abstract public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String dob;
	private String contact;
	
	public User(int id, String name, String email, String password, String dob, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.contact = contact;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
}
