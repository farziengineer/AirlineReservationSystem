package com.nissan.corejava.project.utilities;

public class LoginAdmin extends Login{

	@Override
	public boolean Verify() {
		String user = new String();
		String pass = new String();
		String name = getName();
		String password = getPassword();

		
		if(user.equals(name) && pass.equals(password))
		{ return true;} 
		
		return false;
	}

	
}