package com.t3h.demo.bean;

public class User {
	private String username;
	private String pass;
	private String salt;

	public User() {
	}
	
	public User(String username, String pass, String salt) {
		super();
		this.username = username;
		this.pass = pass;
		this.salt = salt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
