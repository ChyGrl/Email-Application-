package com.ChyGrl.EmailApp;

import java.util.Scanner;

public class Email {
	// this is private so that it is not access directly
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;

	// Constructor to receive first and last name

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED:" + " " + this.firstName + " " + this.lastName);

		// call a method asking for department and return department
		this.department = setDepartment();
		System.out.println("Department:" + this.department);
	}
	
	//Generate a random password
	private String  ramdomPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWYZ0123456789!@#$%";
		char [] password= new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] =passwordSet.charAt(rand);
		}
	}
	
	

	// Ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n 1 for Sales\n 2 for Development \n 3 for Accounting\n 0 for NONE\n Enter Department Code");
		Scanner in = new Scanner(System.in);

		int depChoice = in.nextInt();

		if (depChoice == 1) {
			return "Sales";

		} else if (depChoice == 2) {
			return "Development";

		} else if (depChoice == 3) {
			return "Accounting";

		} else {
			return "";
		}

	}

	// Generate a random password

	// Set mailbox capacity

	// set the alternate email
}
