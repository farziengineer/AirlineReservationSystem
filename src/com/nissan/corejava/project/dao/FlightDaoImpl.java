package com.nissan.corejava.project.dao;

//import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.nissan.corejava.project.pojo.Flight;

public class FlightDaoImpl implements FlightDao {
	Connection con = null;
	
	public void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/airlinesystem", "root", "Admin1234");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public Flight showFlight(int flightId)   {

			createConnection();
			Statement st;
			try {
				st = con.createStatement();
				String str = "select * from Flight where id="+flightId;
				ResultSet rs = st.executeQuery(str); 
				rs.next();
				rs.close();
				st.close();
				System.out.println(rs.getInt(1));
				
			} catch (SQLException e) {
				
			}
		
		return null; 
	}
	
	public void deleteFlight(int flightId) {
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String str = "delete from Flight where id="+flightId;
			st.executeUpdate(str); 
			st.close();
			
		} catch (SQLException e) {
			
		}

		
	
	}
	
	public void updateFlight(int flightId, String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status) {
		createConnection();
		Statement st;
		try {
			st = con.createStatement();
			String str = "update Flight set arrivalTime=?, departureTime=?, source=?, "
					+ "destination=?, airline=?, numOfSeats=?, status=? where id="+flightId;
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setString(1,arrivalTime);
			stmt.setString(2,departureTime);  
			stmt.setString(3, source);
			stmt.setString(4, destination);
			stmt.setString(5, airline);
			stmt.setInt(6, numOfSeats);
			stmt.setInt(7, status);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void addFlight() {
		
	}
}
