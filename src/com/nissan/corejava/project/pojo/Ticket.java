package com.nissan.corejava.project.pojo;

public class Ticket {
	
	private int ticketId;
	private String bookingTime;
	private String passengerName;
	private String passengerDob;
	private String passengerEmail;
	private String passengerContact;
	private int status;
	
	public Ticket(int ticketId, String bookingTime, String passengerName, String passengerDob, String passengerEmail,
			String passengerContact, int status) {
		this.ticketId = ticketId;
		this.bookingTime = bookingTime;
		this.passengerName = passengerName;
		this.passengerDob = passengerDob;
		this.passengerEmail = passengerEmail;
		this.passengerContact = passengerContact;
		this.status = status;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerDob() {
		return passengerDob;
	}

	public void setPassengerDob(String passengerDob) {
		this.passengerDob = passengerDob;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public String getPassengerContact() {
		return passengerContact;
	}

	public void setPassengerContact(String passengerContact) {
		this.passengerContact = passengerContact;
	};
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
