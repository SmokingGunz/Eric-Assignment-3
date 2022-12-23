package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static User[] users = new User[4];

	public static void main(String[] args) throws FileNotFoundException {

		// Make it a method that returns a user array!
		try (BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"))) {
			String line;
			while ((line = fileReader.readLine()) != null) {
				UserService userService = new UserService();
				String userInfo = line;
				String[] userData = userService.parseText(userInfo);
				User user = userService.createUser(userData);
				System.out.println(user);
			

//				for (int i = 0; i < 4; i++) {
//					users[i] = userService.createUser(userData);
//				}
// then for each line made into an array of user information create a user. 
			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
