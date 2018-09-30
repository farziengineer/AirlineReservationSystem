package com.nissan.corejava.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.nissan.corejava.project.pojo.Customer;

public class CustomerDaoImpl implements CustomerDao{
	Connection con = null;
	
	public void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/airlinesystem", "root", "Admin1234");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public Customer getCustomer(String username, String password) {
		createConnection();
		Statement st;
		try {
			String str = "select * from customer where name=? and password=?";
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setString(1, username);
			stmt.setString(2, password);  
			ResultSet rs = stmt.executeQuery(); 
			if(rs == null)
				return null;
			rs.next();
			Customer cus = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			return cus;
			
		} catch (SQLException e) {
			
		}
	
	return null; 
		
	}
	
	public void showAllCustomer() {
		createConnection();
		Statement st;
		try {
			st = con.createStatement();
			String str = "select * from Customer ";
			ResultSet rs = st.executeQuery(str); 
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +  rs.getString(3) + " " +  rs.getString(4) + " " +  rs.getString(5) + " " +  rs.getString(6));
			}
			rs.next();
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			
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
				Customer cus = new Customer(custId, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				System.out.println(rs.getInt(1));
				return cus;
				
			} catch (SQLException e) {
				
			}
		
		return null; 
	}
	
	public void deleteCustomer(int custId) {
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
	
	public void updateCustomer(int custId, String name, String emailId, String password,
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
	
	public void addCustomer(String name, String emailId, String password,
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
