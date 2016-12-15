package com.t3h.decorator.singleton;

public class DemoSingleton {
	private DemoSingleton() {

	}

	private int test;

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

	public static DemoSingleton getDemoSingleton() {
		return demoSingleton;
	}

	public static void setDemoSingleton(DemoSingleton demoSingleton) {
		DemoSingleton.demoSingleton = demoSingleton;
	}

	private static DemoSingleton demoSingleton;

	public static DemoSingleton getInstance() {
		if (demoSingleton == null) {
			demoSingleton = new DemoSingleton();
		}
		return demoSingleton;
	}
}
