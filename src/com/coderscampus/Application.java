package com.coderscampus;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		UserService app = new UserService();
		User[] userArray = app.getUserArray();

		int numberOfTries = 0;
		boolean successfullLogin = false;
		Scanner scanner = new Scanner(System.in);

		while (numberOfTries < 5) {
			System.out.println("Enter your email address");
			String username = scanner.nextLine();
			System.out.println("Enter your password");
			String password = scanner.nextLine();
			if (validUser(userArray, password, username) != true) {
				System.out.println("Invalid login, please try again");
				numberOfTries++;
			} else {
				successfullLogin = true;
				break;
			}
		}
		if (successfullLogin != true) {
			System.out.println("Too many failed login attempts, you are now locked out.");
		}
		scanner.close();

	}

	public static boolean validUser(User[] usersArray, String password, String username) {
		for (User user : usersArray) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				System.out.println("Welcome " + user.getName());
				return true;
			}

		}
		return false;

	}
}
