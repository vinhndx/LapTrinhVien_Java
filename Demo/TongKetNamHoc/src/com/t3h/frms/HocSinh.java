package com.t3h.frms;

import java.io.Serializable;

public class HocSinh implements Serializable{
	private String hoVaTen;
	private String khoiLop;
	private double diemHK1;
	private double diemHK2;

	public HocSinh(String hoVaTen, String khoiLop, double diemHK1,
			double diemHK2) {
		this.hoVaTen = hoVaTen;
		this.khoiLop = khoiLop;
		this.diemHK1 = diemHK1;
		this.diemHK2 = diemHK2;
	}
	
	public HocSinh() {
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getKhoiLop() {
		return khoiLop;
	}

	public void setKhoiLop(String khoiLop) {
		this.khoiLop = khoiLop;
	}

	public double getDiemHK1() {
		return diemHK1;
	}

	public void setDiemHK1(double diemHK1) {
		this.diemHK1 = diemHK1;
	}

	public double getDiemHK2() {
		return diemHK2;
	}

	public void setDiemHK2(double diemHK2) {
		this.diemHK2 = diemHK2;
	}

}
