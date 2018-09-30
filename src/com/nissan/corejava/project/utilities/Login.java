package com.nissan.corejava.project.utilities;

import java.util.Scanner;
abstract public class Login {
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void inputDetails() {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter Name");
		name = input.nextLine();
		System.out.println("Enter password");
		password = input.nextLine();
	}
	
	abstract public boolean Verify();
	
}
