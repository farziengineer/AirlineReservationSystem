package com.nissan.corejava.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.nissan.corejava.project.pojo.Flight;

public class FlightDaoImpl implements FlightDao {
	Connection con = null;
	
	public void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/airlinesystem", "root", "Admin1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
//			System.out.println(rs.getInt(1));
			
		} catch (SQLException e) {
			
		}

		
	
	}
	
	public void updateFlight(int flightId) {
		
		
	}
	
	public void addFlight() {
		
	}
}
