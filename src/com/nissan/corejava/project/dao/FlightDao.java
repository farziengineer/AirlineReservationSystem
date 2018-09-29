package com.nissan.corejava.project.dao;
import com.nissan.corejava.project.pojo.Flight;

public interface FlightDao{
	public Flight showFlight(int flightId);
	public void deleteFlight(int flightId);
	public void updateFlight(int flightId, String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status);
	public void addFlight(String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status);
}
