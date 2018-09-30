package com.nissan.corejava.project.utilities;

import java.util.Scanner;

import com.nissan.corejava.project.pojo.Customer;

public class CustomerView {

	public void display(Customer c) {
		
		System.out.println("WELCOME,");
		System.out.println(c.getName());
		System.out.println("Press 1.To Book a Flight \n 2.To Cancel a Flight "
				+ "3. To Reschedule a Flight \n 4.To Show previous Booking  "
				+ "5. Logout");
		
		while(true)
		{
			
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			CustomerViewUtility viewUtility = new  CustomerViewUtility();
			switch(option) {
			
				case 1: viewUtility.bookFlight();
					break;
				case 2: viewUtility.cancelFlight();
					break;
				case 3: viewUtility.resheduleFlight();
					break;
				case 4:
					viewUtility.showBooking();
					break;
				case 5: System.out.println("Thank You");
					break;
			}
		}
		
		
	}
}