package com.t3h.demo;

public class SinhVien implements Comparable<SinhVien>{
	private String ten;
	private int tuoi;
	
	public SinhVien(String ten,  int tuoi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.tuoi - o.getTuoi();
	}

	@Override
	public String toString() {
		return this.ten + " - " + this.tuoi;
	}
}
