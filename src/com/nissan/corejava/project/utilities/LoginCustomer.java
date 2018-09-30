package com.nissan.corejava.project.utilities;

public class LoginCustomer extends Login{

	@Override
	public boolean Verify() {
		String user = new String();
		String pass = new String();

		
		if(user.equals(this.getName()) && pass.equals(this.getPassword()))
		{
			return true;
		} 
		
		return false;
		
		
	}

}