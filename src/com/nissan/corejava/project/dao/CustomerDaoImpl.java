package com.nissan.corejava.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.nissan.corejava.project.pojo.Customer;

public class CustomerDaoImpl {
	Connection con = null;
	
	public void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/airlinesystem", "root", "Admin1234");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public Customer showCustomer(int custId)   {

			createConnection();
			Statement st;
			try {
				st = con.createStatement();
				String str = "select * from Customer where id="+custId;
				ResultSet rs = st.executeQuery(str); 
				rs.next();
				rs.close();
				st.close();
				System.out.println(rs.getInt(1));
				
			} catch (SQLException e) {
				
			}
		
		return null; 
	}
	
	public void deleteFlight(int custId) {
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String str = "delete from Customer where id="+custId;
			st.executeUpdate(str); 
			st.close();
			
		} catch (SQLException e) {
			
		}

		
	
	}
	
	public void updateFlight(int custId, String name, String emailId, String password,
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
			System.out.println(i+" records updated in Customer db");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void addFlight(String name, String emailId, String password,
			String dob, String contact) {
		
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String str = "insert into Customer Values(0, ?, ?, ?, ?, ?)";
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setString(1, name);
			stmt.setString(2, emailId);  
			stmt.setString(3, password);
			stmt.setString(4, dob);
			stmt.setString(5, contact);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated in Customer db");			
			System.out.println(i+" records updated");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	
	
}
