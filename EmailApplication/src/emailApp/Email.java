package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "abccomapny.com";
	
	//Constructor to receive the first & last name
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call a method asking for department - return the department
		
		this.department = setDepartment();
		
		
		//Call a method that return a random password
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: "+ this.password);
		
		//Combine element to generate email
		email = firstName.toLowerCase()+ "." + lastName.toLowerCase()+ "@" + department + "." + companySuffix ;
		
		
		
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.print("New Worker: "+ firstName+"\nDEPARTMENT CODES: \n1 for Sales\n2 for Dvelopment\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if(departmentChoice == 1) { return "sales";}
		else if(departmentChoice == 2) { return "dev";}
		else if(departmentChoice == 3) {return "acct";}
		else { return "";}
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() { return alternateEmail;}
	public String getPassword() { return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName +" "+ lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
	}
}