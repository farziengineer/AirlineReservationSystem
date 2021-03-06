package com.nissan.corejava.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.nissan.corejava.project.pojo.Admin;
import com.nissan.corejava.project.pojo.Customer;

public class AdminDaoImpl implements AdminDao{
	Connection con = null;
	
	public void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/airlinesystem", "root", "Admin1234");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public Admin showAdmin(int custId)   {

			createConnection();
			Statement st;
			try {
				st = con.createStatement();
				String str = "select * from Admin where id="+custId;
				ResultSet rs = st.executeQuery(str); 
				rs.next();
				rs.close();
				st.close();
				System.out.println(rs.getInt(1));
				
			} catch (SQLException e) {
				
			}
		
		return null; 
	}
	
	public void deleteAdmin(int custId) {
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String str = "delete from Admin where id="+custId;
			st.executeUpdate(str); 
			st.close();
			
		} catch (SQLException e) {
			
		}

		
	
	}
	
	public void updateAdmin(int custId, String name, String emailId, String password,
			String dob, String contact) {
		createConnection();
		Statement st;
		try {
			st = con.createStatement();
			String str = "update Flight set  name=?, emailId=?, "
					+ "password=?, dob=?, contact=? where id="+custId;
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setString(1, name);
			stmt.setString(2, emailId);  
			stmt.setString(3, password);
			stmt.setString(4, dob);
			stmt.setString(5, contact);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated in Admin db");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void addAdmin(String name, String emailId, String password,
			String dob, String contact) {
		
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String strk = "select *  from Admin";
			ResultSet rs = st.executeQuery(strk); 
			int cnt = 0;
			while(rs.next())cnt++;
			if(cnt == 1) {
				System.out.println("Only one admin is possible in db");
				return;
			}
			
			String str = "insert into Admin Values(0, ?, ?, ?, ?, ?)";
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setString(1, name);
			stmt.setString(2, emailId);  
			stmt.setString(3, password);
			stmt.setString(4, dob);
			stmt.setString(5, contact);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated in Admin db");			
			System.out.println(i+" records updated");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

public Admin getAdmin(String name,String password) {
	createConnection();
	Statement st;
	try {
		String str = "select * from admin where cust_id=1";
		PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
		ResultSet rs = stmt.executeQuery(); 
		rs.next();
		Admin cus = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
		rs.close();
		return cus;
			
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

return null; 
		
		
		
}
	
}
