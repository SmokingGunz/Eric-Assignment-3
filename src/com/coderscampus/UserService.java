package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

	public static User createUser(String[] stringInputs) {

		String userName = stringInputs[0];
		String passWord = stringInputs[1];
		String name = stringInputs[2];
		User user = new User();
		user.setName(name);
		user.setPassword(passWord);
		user.setUsername(userName);
		return user;

	}

	public static String[] parseText(String inputs) {

		String input = inputs;
		String[] textParse = input.split(",");
		return textParse;

	}

	public User[] getUserArray() throws FileNotFoundException {
		User[] users = new User[4];
		String[] userData = null;
		int i = 0;
		try (BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"))) {
			String line;
			while ((line = fileReader.readLine()) != null) {
				String userInfo = line;
				userData = parseText(userInfo);
				users[i] = createUser(userData);
				i++;

			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for(User user : users) {
//			System.out.println(user);
//		}
		return users;
	}
}
