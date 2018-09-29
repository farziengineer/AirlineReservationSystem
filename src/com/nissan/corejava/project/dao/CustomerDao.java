package com.nissan.corejava.project.dao;

import com.nissan.corejava.project.pojo.Customer;

abstract interface CustomerDao {
	public Customer showCustomer(int custId);
	public void deleteCustomer(int custId);
	public void updateCustomer(int custId, String name, String emaidId, String password,
			String dob, String contact);
	public void addCustomer(String name, String emaidId, String password,
			String dob, String contact);

	
}
