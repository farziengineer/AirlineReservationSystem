package com.nissan.corejava.project.utilities;

import com.nissan.corejava.project.dao.AdminDaoImpl;
import com.nissan.corejava.project.pojo.Admin;

public class RegisterAdmin extends Register{

	@Override
	public int register() {
		// TODO Auto-generated method stub
		AdminDaoImpl adminDao = new AdminDaoImpl();
		adminDao.addAdmin(getName(), getEmail(), getPassword(), getDob(), getContact());
		return 0;
	}
	
	

}