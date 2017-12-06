package com.ChyGrl.EmailApp;

import java.util.Scanner;

public class Email {
	// this is private so that it is not access directly
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int daultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "ChyGrlIndustries";

	// Constructor to receive first and last name

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// call a method asking for department and return department

		this.department = setDepartment();

		// Call a method that returns a Random Password
		this.password = randomPassword(daultPasswordLength);
		System.out.println("Your Password is: " + password);

		// Combine Elements to generate Email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix
				+ ".com";
	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTyUuVvWwXxYyZz0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Ask for department
	private String setDepartment() {
		System.out.print(
				"New Worker::" + lastName+"," + " " +firstName+ "\nDepartment Codes: "
						+ "\n 1 : Sales\n 2 : Development \n 3 : Accounting\n 0 : Not Listed \n Enter Department Code -->:: ");
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

	// Set mailbox capacity
	public void setMailboxCapicity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;

	}

	// change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {

		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() 
	{return password;
}
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nCompany Email: " + email + 
				"\nMailbox Capacty: " + mailboxCapacity + "mb";
 	}
	
}
