package com.t3h.demo.service;

import javax.ejb.Local;

@Local
public interface HelloServiceLocal {
	String sayHello(String name);
	String sayHello2(String name);
}
