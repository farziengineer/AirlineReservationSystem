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
		System.out.println("Choose the id of the fight you want to update");
		Scanner input = new Scanner(System.in);
		int flightId = input.nextInt();
		System.out.println("Enter arrival time");
		String arrivalTime = input.next();
		System.out.println("Enter departure time");
		String departureTime = input.next();
		System.out.println("Enter the source");
		String source = input.next();
		System.out.println("Enter the destination");
		String destination = input.next();
		System.out.println("Enter airline");
		String airline = input.next();
		System.out.println("Enter number of seats");
		int numOfSeats = input.nextInt();
		System.out.println("Enter the status ");
		int status = input.nextInt();
		flightImpl.updateFlight(flightId, arrivalTime, departureTime, source, destination, airline, numOfSeats, status);
		
	}

	public void cancelFlight() {
		FlightDaoImpl flightImpl = new FlightDaoImpl();
		flightImpl.showAllFlight();
		System.out.println("Choose the id of the fight you want to cancel");
		Scanner input = new Scanner(System.in);
		int flightId = input.nextInt();
		flightImpl.deleteFlight(flightId);
		System.out.println("deleted");
		
	}

	public void showBooking() {
		FlightDaoImpl flightImpl = new FlightDaoImpl();
		flightImpl.showAllFlight();

		
	}

}
