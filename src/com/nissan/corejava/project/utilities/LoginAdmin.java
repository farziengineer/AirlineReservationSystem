package com.nissan.corejava.project.utilities;

import com.nissan.corejava.project.dao.AdminDaoImpl;
import com.nissan.corejava.project.dao.CustomerDaoImpl;
import com.nissan.corejava.project.pojo.Admin;
import com.nissan.corejava.project.pojo.Customer;

public class LoginAdmin extends Login{

	@Override
	public boolean Verify() {
		
		String username = new String();
		String password = new String();
		AdminDaoImpl adminImpl = new AdminDaoImpl();
		Admin admin = adminImpl.getAdmin(username, password);

		return admin != null;
	
	}

	public Admin getDetails() {
		String name =getName();
		String password = getPassword();

	
		AdminDaoImpl adminDaoImp = new AdminDaoImpl();
		//		System.out.println("");
		Admin admin = adminDaoImp.getAdmin(name,password);
	
		//System.out.println(customer.getName()+" "+customer.getPassword());
		return(admin);
		// TODO Auto-generated method stub

	}
	
}