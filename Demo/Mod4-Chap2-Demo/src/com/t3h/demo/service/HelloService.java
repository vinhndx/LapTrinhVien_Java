package com.t3h.demo.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloService implements HelloServiceRemote, HelloServiceLocal {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	
	public String sayHello2(String name) {
		return "Hello " + name;
	}
}
