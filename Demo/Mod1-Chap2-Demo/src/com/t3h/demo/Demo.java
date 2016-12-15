package com.t3h.demo;

public class Demo {
	public static void main(String[] args) {
		String s = "Hello";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s);
		}
		
		for (char c : s.toCharArray()) {
			System.out.println(c);
		}
	}
}
