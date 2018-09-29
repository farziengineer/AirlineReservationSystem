package com.nissan.corejava.project.dao;

public class DemoDao {
	
	public static void main(String[] args) {
		FlightDaoImpl fl = new FlightDaoImpl();
		fl.showFlight(1);
		fl.deleteFlight(1);
	}
	
}
