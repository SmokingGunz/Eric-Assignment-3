package com.coderscampus;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

//	public static User[] users = new User[4];

	public UserService app = new UserService();
	User[] userArray = app.getUserArray();
	public static void main(String[] args) throws FileNotFoundException {
		

		int numberOfTries = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your email address");
		String username = scanner.nextLine();
		System.out.println("Enter your password");
		String password = scanner.nextLine();
		User userInput = new User(username, password);
		
		while (numberOfTries < 5) {
			if (app.validUser(username, password).equals(userInput)) {

			}
		}
	
	}
	private User validUser(String username, String password) {
		for(User user : userArray) {
			System.out.println(user);
		}
		return null;
			
		}
}
