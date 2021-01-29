package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your First Name: \n");
		String firstName = in.nextLine();
		System.out.println("Enter your Last Name: \n");
		String lastName = in.nextLine();
		Email em1 = new Email(firstName, lastName);
		System.out.println(em1.showInfo());
	}

}
