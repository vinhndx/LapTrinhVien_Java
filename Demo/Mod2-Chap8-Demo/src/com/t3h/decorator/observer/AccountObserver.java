package com.t3h.decorator.observer;

public abstract class AccountObserver {
	protected Account account;
	
	public AccountObserver(Account account) {
		this.account = account;
	}
	
	public abstract void update();
}
