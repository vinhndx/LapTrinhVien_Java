package com.t3h.demo.service;

import javax.ejb.Remote;

@Remote
public interface HelloServiceRemote {
	String sayHello(String name);
}
