package com.coderscampus;

public class UserService {

	public User validUser(String username, String password) {
		
		for(User user : Application.users) {
			
			
			
		}

	public User createUser(String[] stringInputs) {

		String userName = stringInputs[0];
		String passWord = stringInputs[1];
		String name = stringInputs[2];
		User user = new User();
		user.setName(name);
		user.setPassword(passWord);
		user.setUsername(userName);
		return user;

	}

	public String[] parseText(String inputs) {

		String input = inputs;
		String[] textParse = input.split(",");
		return textParse;

	}
}
