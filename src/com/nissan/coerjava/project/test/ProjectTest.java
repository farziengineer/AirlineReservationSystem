package com.nissan.coerjava.project.test;

import java.util.Scanner;

import com.nissan.corejava.project.dao.CustomerDaoImpl;
import com.nissan.corejava.project.pojo.Admin;
import com.nissan.corejava.project.pojo.Customer;
import com.nissan.corejava.project.utilities.CustomerView;
import com.nissan.corejava.project.utilities.LoginAdmin;
import com.nissan.corejava.project.utilities.LoginCustomer;


public class ProjectTest {

	public static void main(String args[]) {
	
		while(true) {
			
			System.out.println("WELCOME TO AIRLINE RESERVATION SYSTEM");
			System.out.println("PRESS \n 1.REGISTER \n 2.LOGIN \n 3.EXIT");
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			
			if(option==1) {
				
				System.out.println("PRESS \n 1.User \n 2.Admin \n 3.EXIT");
				
				
			}
			if(option==2) {
				
				System.out.println("PRESS \n 1.User \n 2.Admin \n 3.EXIT");
				option = input.nextInt();
				
				if(option==1) {
						while(true) {
						LoginCustomer user = new LoginCustomer();
						user.inputDetails();
						CustomerDaoImpl cusImpl = new CustomerDaoImpl();
						Customer customer = cusImpl.getCustomer(user.getName(), user.getPassword());
						
						
						
						if(customer != null)
						{
							System.out.println(customer);
							CustomerView view = new CustomerView();
							view.display(customer);
						}
						else
						{
							System.out.println("IncorrectDetails");
						}
					}
				} 
				else if(option==2) {
				}
				
			}
			
			if(option==3) {
				System.out.println("Thank you");
				break;
			
			}
			
		}
		
		System.exit(0);
	}
}