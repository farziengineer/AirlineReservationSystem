package com.nissan.corejava.project.utilities;

import com.nissan.corejava.project.dao.CustomerDaoImpl;
import com.nissan.corejava.project.pojo.Customer;

public class LoginCustomer extends Login{

	@Override
	public boolean Verify() {
		String username = new String();
		String password = new String();
		CustomerDaoImpl cusImpl = new CustomerDaoImpl();
		Customer customer = cusImpl.getCustomer(username, password);

		return customer != null;
		
//		return false;
	}

}