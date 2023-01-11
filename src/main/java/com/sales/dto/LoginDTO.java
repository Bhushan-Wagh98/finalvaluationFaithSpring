package com.sales.dto;

public class LoginDTO {

	private String username;

	private String password;

//	constructor
	public LoginDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

//	constructor
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

//	getters and setters
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

}
