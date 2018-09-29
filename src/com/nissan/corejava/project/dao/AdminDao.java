package com.nissan.corejava.project.dao;

import com.nissan.corejava.project.pojo.Admin;

abstract interface AdminDao {
	public Admin showAdmin(int adminId);
	public void deleteAdmin(int adminId);
	public void updateAdmin(int adminId, String name, String emaidId, String password,
			String dob, String contact);
	public void addAdmin(String name, String emaidId, String password,
			String dob, String contact);

	
}
