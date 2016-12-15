package com.t3h.demo;

import java.io.Serializable;

public class SinhVien implements Serializable{
	
	private String ten;
	private int tuoi;
	private String lop;

	public SinhVien(String a, int tuoi, String lop) {
		this.ten = a;
		this.tuoi = tuoi;
		this.lop = lop;
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
	public String toString() {
		return getTen() + " - " + getLop() + " - " + getTuoi();
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
}
