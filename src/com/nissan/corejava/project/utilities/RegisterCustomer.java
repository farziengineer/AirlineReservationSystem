package com.nissan.corejava.project.utilities;

import com.nissan.corejava.project.dao.CustomerDaoImpl;
import com.nissan.corejava.project.pojo.Customer;


public class RegisterCustomer extends Register{

	@Override
	public int register() {
		// TODO Auto-generated method stub
		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		customerDao.addCustomer(getName(),getEmail(),getPassword(),getDob(),getContact());
		return 0;
	}

	
}