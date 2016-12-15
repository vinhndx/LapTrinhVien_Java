package com.t3h.decorator.observer;

public class XXXObserver extends AccountObserver {

	
	
	public XXXObserver(Account account) {
		super(account);
		account.attach(this);
	}

	@Override
	public void update() {
		System.out.println("XXX: Tai khoan cua ban hien tai la: " + account.getTaiKhoan());
	}

}
