package com.nissan.corejava.project.dao;

public class DemoDao {
	
	public static void main(String[] args) {
		FlightDaoImpl fl = new FlightDaoImpl();
//		fl.showFlight(1);
//		fl.deleteFlight(1);
//		fl.updateFlight(2, "23", "45", "dsaf", "sad", "dfgd", 23, 1);
		fl.addFlight("324", "453", "sdkfj", "asmdjf", "askflj", 12, 2);
	}
	
}
