package com.t3h.demo.service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateful;
import javax.ejb.Stateless;


@Singleton
@Startup
@LocalBean
public class AccountService implements AccountServiceRemote, AccountServiceLocal {

	private double soDu = 5000000;
	
	@EJB
	private HelloServiceLocal hello;
	
	@Override
	public void rutTien(double soTien) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		soDu -= soTien;
	}

	@Override
	public void napTien(double soTien) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		soDu += soTien;
	}

	@Override
	public double xemSoDu() {
		return soDu;
	}


}
