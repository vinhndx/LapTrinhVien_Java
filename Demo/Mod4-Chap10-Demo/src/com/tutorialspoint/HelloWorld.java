package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
	private String message;
	
	@Autowired
	private User user3;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
	
	public void getUsername(){
		System.out.println("Username " + user3.getUsername());
	}
}