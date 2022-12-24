package com.coderscampus;

import java.io.FileNotFoundException;

public class Application {

//	public static User[] users = new User[4];

	public static void main(String[] args) throws FileNotFoundException {

		UserService app = new UserService();
		User[] users = app.getUserArray();
		for (User user : users) {
			System.out.println(user);
		}
	}

}
