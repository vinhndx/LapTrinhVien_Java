package com.t3h.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import com.t3h.interceptor.LoginInterceptor;

@Stateless
@LocalBean
public class LoginService implements LoginServiceRemote, LoginServiceLocal {

	@Override
	@Interceptors(LoginInterceptor.class)
	public String checkLogin(String username, String password) {
		
		if(username.equals(password)){
			return "Dang nhap thanh cong";
		} else {
			return "Dang nhap that bai";
		}
	}


}
