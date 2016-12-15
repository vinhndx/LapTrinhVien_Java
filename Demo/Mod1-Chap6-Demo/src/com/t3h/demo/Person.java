package com.t3h.demo;

public class Person implements Comparable<Person>{
	private String ten;
	private int namSinh;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public Person(String ten, int namSinh) {
		super();
		this.ten = ten;
		this.namSinh = namSinh;
	}

	@Override
	public int compareTo(Person p) {
		System.out.println(getNamSinh() - p.getNamSinh());
		return getNamSinh() - p.getNamSinh();
	}

}
