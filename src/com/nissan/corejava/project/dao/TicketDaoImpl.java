package com.nissan.corejava.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.nissan.corejava.project.pojo.Ticket;

public class TicketDaoImpl implements TicketDao {
	Connection con = null;
	
	public void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/airlinesystem", "root", "Admin1234");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public Ticket showTicket(int ticketId)   {

			createConnection();
			Statement st;
			try {
				st = con.createStatement();
				String str = "select * from Ticket where id="+ticketId;
				ResultSet rs = st.executeQuery(str); 
				rs.next();
				rs.close();
				st.close();
				System.out.println(rs.getInt(1));
				
			} catch (SQLException e) {
				
			}
		
		return null; 
	}
	
	public void deleteTicket(int ticketId) {
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String str = "delete from Ticket where id="+ticketId;
			st.executeUpdate(str); 
			st.close();
			
		} catch (SQLException e) {
			
		}

		
	
	}
	
	public void updateTicket(int ticketId, String name, String email, String dob, String contact, int status) {
		createConnection();
		Statement st;
		try {
			st = con.createStatement();
			String str = "update Flight set  name=?, email=?, dob=?, contact=?, ticket_status=? where id="+ticketId;
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setString(1, name);
			stmt.setString(2, email);  
			stmt.setString(3, dob);
			stmt.setString(4, contact);
			stmt.setInt(5, status);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated in Customer db");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void addTicket(int flightId, int custId, String name, String email, String dob, String contact, int status) {
		
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String str = "insert into Customer Values(0, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setInt(2, flightId);
			stmt.setInt(3, custId);
			stmt.setString(4, name);
			stmt.setString(5, email);  
			stmt.setString(6, dob);
			stmt.setString(7, contact);
			stmt.setInt(8, status);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated in Customer db");			
			System.out.println(i+" records updated");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	
	
}
