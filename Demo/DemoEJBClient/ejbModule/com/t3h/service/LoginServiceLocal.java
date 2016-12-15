package com.t3h.service;

import javax.ejb.Local;

@Local
public interface LoginServiceLocal {
	String checkLogin(String username, String password);
}
