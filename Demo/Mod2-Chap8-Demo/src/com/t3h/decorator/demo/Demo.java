package com.t3h.decorator.demo;

import com.t3h.decorator.bean.BanhMi;
import com.t3h.decorator.bean.BanhMiKhong;
import com.t3h.decorator.decorator.BanhMiKhuyenMaiDecorator;
import com.t3h.decorator.decorator.BanhMiThemNuocXotDecorator;
import com.t3h.decorator.decorator.BanhMiThemThitDecorator;
import com.t3h.decorator.factory.Animal;
import com.t3h.decorator.factory.AnimalFactory;
import com.t3h.decorator.factory.AnimalFactory.AnimalType;
import com.t3h.decorator.observer.Account;
import com.t3h.decorator.observer.EmailObserver;
import com.t3h.decorator.observer.SMSObserver;
import com.t3h.decorator.observer.XXXObserver;
import com.t3h.decorator.singleton.DemoSingleton;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		// decorator();
		// singleton();
		// factory();
		
		Account account = new Account(1000);
		
		new SMSObserver(account);
		new EmailObserver(account);
		new XXXObserver(account);
		
		account.setTaiKhoan(5000);
		Thread.sleep(2000);
		account.setTaiKhoan(2000);
		Thread.sleep(2000);
		account.setTaiKhoan(3000);
		
		
		
	}

	private static void factory() {
		Animal animal1 = AnimalFactory.getAnimal(AnimalType.CAT);
		animal1.say();
		Animal animal2 = AnimalFactory.getAnimal(AnimalType.BIRD);
		
		animal2.say();
	}

	private static void singleton() {
		DemoSingleton demoSingleton1 = DemoSingleton.getInstance();
		DemoSingleton demoSingleton2 = DemoSingleton.getInstance();

		demoSingleton1.setTest(10);
		demoSingleton2.setTest(11);

		System.out.println(demoSingleton1.getTest());
		System.out.println(demoSingleton2.getTest());
	}

	private static void decorator() {
		BanhMi banhMi = new BanhMiKhong();

		banhMi = new BanhMiThemThitDecorator(banhMi);
		banhMi = new BanhMiThemNuocXotDecorator(banhMi);
		banhMi = new BanhMiKhuyenMaiDecorator(banhMi);
		banhMi = new BanhMiKhuyenMaiDecorator(banhMi);

		System.out.println(banhMi.xemThanhPhan());
		System.out.println(banhMi.xemGia());
	}
}
