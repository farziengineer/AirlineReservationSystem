package com.nissan.corejava.project.dao;

public class DemoDao {
	
	public static void main(String[] args) {
		FlightDaoImpl fl = new FlightDaoImpl();
		CustomerDaoImpl cu = new CustomerDaoImpl();
		cu.addFlight("anand", "as", "123", "srwedf", "01923819");

	}
	
}
