package com.t3h.demo;




public class Demo {

	public static void main(String[] args) {
		
		String s1 = new String("a");
		String s2 = new String("a");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	/*	NhanVien nv1 = new NhanVien("A");
		NhanVien nv2 = new NhanVien("B");
		
		 
		System.out.println(nv1);
		System.out.println(nv2);
		
		test(nv1, nv2);
		 
		System.out.println(nv1);
		System.out.println(nv2);*/
	}

	private static void test(NhanVien a, NhanVien b) {
		
		a.setTen("XXXX");
		b.setTen("YYYY");

		a = new NhanVien("tttt");
		b = new NhanVien("kkkkkk");
	}
	
	

}
