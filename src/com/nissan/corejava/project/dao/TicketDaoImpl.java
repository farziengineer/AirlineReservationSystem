package com.nissan.corejava.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.nissan.corejava.project.pojo.Customer;
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
	
	public boolean verifyTicketId(Customer cust, int ticketId) {
		createConnection();
		Statement st;
		try {
			st = con.createStatement();
			String str = "select * from Ticket where cust_id="+cust.getId();
			ResultSet rs = st.executeQuery(str); 
			while(rs.next()) {
				if(rs.getInt(1) == ticketId)
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			
		return false;
	}
	public void showAll(Customer cust) {
		createConnection();
		Statement st;
		try {
			st = con.createStatement();
			String str = "select * from Ticket where cust_id="+cust.getId();
			ResultSet rs = st.executeQuery(str); 
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5) + " "  + rs.getString(6) + " " +
			rs.getString(7) + " " + rs.getInt(8));
			}
		} catch (SQLException e) {
//			e.printStackTrace();
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
			String str = "delete from Ticket where ticket_id="+ticketId;
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
			String str = "insert into Ticket Values(0, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setInt(1, flightId);
			stmt.setInt(2, custId);
			stmt.setString(3, name);
			stmt.setString(4, email);  
			stmt.setString(5, dob);
			stmt.setString(6, contact);
			stmt.setInt(7, status);
			int i=stmt.executeUpdate();  
//			System.out.println(i+" records updated in Customer db");			
//			System.out.println(i+" records updated");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	
	
}
