package com.t3h.demo;


public class Demo {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		/*InnerDemo innerDemoImpl = new InnerDemo() {
			
			@Override
			public void doSth() {
				System.out.println("ABC");
			}
		};
		InnerDemo innerDemo2 = new InnerDemo() {
			
			@Override
			public void doSth() {
				System.out.println("XYZ");
				
			}
		};
		outerClass.doSthOuter2(innerDemoImpl);*/
		
		outerClass.doSthOuter2(new InnerDemo() {
			
			@Override
			public void doSth() {
				System.out.println("XXXXX");
			}
		});
		
		outerClass.doSthOuter2(new InnerDemo() {
			
			@Override
			public void doSth() {
				System.out.println("YYYYYYYY");
			}
		});
	}
}
