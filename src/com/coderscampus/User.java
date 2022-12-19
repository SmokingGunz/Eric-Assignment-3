package com.coderscampus;

public class User {

	// POJO

	private String username;
	private String password;
	private String name;
	
	public User (String[] userValue) {
		this.username = userValue[0];
		this.password = userValue[1];
		this.name = userValue[2];
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
