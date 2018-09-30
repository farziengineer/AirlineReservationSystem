package com.nissan.corejava.project.utilities;

import java.util.Scanner;

import com.nissan.corejava.project.dao.FlightDaoImpl;

public class AdminViewUtility {
	
	public void bookFlight() {
		Scanner input = new Scanner(System.in);
		FlightDaoImpl flightImpl = new FlightDaoImpl();
		flightImpl.showAllFlight();
		System.out.println("Enter airline");
		String airline = input.next();
		System.out.println("Enter arrival time");
		String arrivalTime = input.next();
		System.out.println("Enter departure time");
		String departureTime = input.next();
		System.out.println("Enter source ");
		String source = input.next();
		System.out.println("Enter destination");
		String destination = input.next();
		System.out.println("Enter the number of seats");
		int numOfSeats = input.nextInt();
		System.out.println("Enter the status ");
		int status = input.nextInt();
		flightImpl.addFlight(arrivalTime, departureTime, source, destination, airline, numOfSeats, status);
		
	}

	public void rescheduleFlight() {
		FlightDaoImpl flightImpl = new FlightDaoImpl();
		flightImpl.showAllFlight();
		System.out.println("Choose the flight id to update");
		
		
		
	}

	public void cancelFlight() {
		// TODO Auto-generated method stub
		
	}

	public void showBooking() {
		// TODO Auto-generated method stub
		
	}

}
