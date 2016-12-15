package com.t3h.decorator.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private long taiKhoan;
	private List<AccountObserver> observers = new ArrayList<AccountObserver>();
	
	public Account(long taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	
	public long getTaiKhoan() {
		return taiKhoan;
	}
	
	public void setTaiKhoan(long taiKhoan) {
		this.taiKhoan = taiKhoan;
		notifyAllObserver();
	}
	
	public void attach(AccountObserver observer){
		observers.add(observer);
	}
	
	public void notifyAllObserver(){
		for (AccountObserver accountObserver : observers) {
			accountObserver.update();
		}
	}
	
}
