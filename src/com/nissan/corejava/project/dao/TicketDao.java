package com.nissan.corejava.project.dao;
import com.nissan.corejava.project.pojo.Ticket;

public interface TicketDao {
	public Ticket showTicket(int ticketId);
	public void deleteTicket(int ticketId);
	public void updateTicket(int ticketId, String name, String email, String dob, String contact, int status);
	public void addTicket(int flightId, int custId, String name, String email, String dob, String contact, int status);

}
