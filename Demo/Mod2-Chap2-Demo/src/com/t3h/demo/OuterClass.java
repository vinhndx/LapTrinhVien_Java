package com.t3h.demo;

public class OuterClass {
//	private int i = 11;
	
	public void doSthOuter2(InnerDemo demo ) {
		demo.doSth();
	}
	
	/*public void doSthOuter(int a) {
		final int abc = 100;
		final class InnerClass{
			private int a;
			
			public void doSth(){
				i = 10;
				System.out.println(abc);
				System.out.println(getI());
			}
		}
	}*/
	
	
	
	
	/*private int getI() {
		return i;
	}*/
	
	
}
