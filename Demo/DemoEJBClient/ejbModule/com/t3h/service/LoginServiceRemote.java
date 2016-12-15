package com.t3h.service;

import javax.ejb.Remote;

@Remote
public interface LoginServiceRemote {
	String checkLogin(String username, String password);
}
