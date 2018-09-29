package com.nissan.corejava.project.dao;
import com.nissan.corejava.project.pojo.Ticket;

public interface TicketDao {
	public Ticket showTicket(int ticketId);
	public void deleteTicket(int ticketId);
	public void updateTicket(int ticketId, String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status);
	public void addTicket(String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status);

}
