package com.t3h.demo;

public class HocSinh{
	private String ten;
	private int tuoi;

	public HocSinh(String ten, int tuoi) {
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
	public String toString() {
		return "Ten: " + ten + " - Tuoi: " + tuoi; 
	}

/*	@Override
	public int compareTo(HocSinh o) {
		return this.tuoi - o.tuoi;
	} 
*/}
