package com.t3h.service;

public class LoginService {
	
	// Goi LoginDAO de check username/pass
	public boolean checkLogin(String username, String password){
		return "admin".equals(username) && "admin".equals(password);
	}
}
