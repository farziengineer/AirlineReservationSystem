package com.nissan.corejava.project.dao;
import com.nissan.corejava.project.pojo.Flight;

public interface FlightDao{
	public Flight showFlight(int flightId);
	public void deleteFlight(int flightId);
	public void updateFlight(int flightId);
	public void addFlight();
}
