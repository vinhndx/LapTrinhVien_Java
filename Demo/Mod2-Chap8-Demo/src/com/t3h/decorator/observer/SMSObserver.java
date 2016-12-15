package com.t3h.decorator.observer;

public class SMSObserver extends AccountObserver {

	
	
	public SMSObserver(Account account) {
		super(account);
		account.attach(this);
	}

	@Override
	public void update() {
		System.out.println("SMS: Tai khoan cua ban hien tai la: " + account.getTaiKhoan());
	}

}
