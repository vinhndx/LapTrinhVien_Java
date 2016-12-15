package com.t3h.decorator.observer;

public class EmailObserver extends AccountObserver {

	
	
	public EmailObserver(Account account) {
		super(account);
		account.attach(this);
	}

	@Override
	public void update() {
		System.out.println("EMAIL: Tai khoan cua ban hien tai la: " + account.getTaiKhoan());
	}

}
