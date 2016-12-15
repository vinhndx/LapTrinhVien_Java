package com.t3h.beans;

public class SanPham {
	private int id;
	private String tenSP;
	private String hinhAnh;
	private double giaCu;
	private double giaMoi;

	public SanPham(int id, String hinh, String ten, double giaCu, double giaMoi) {
		super();
		this.id = id;
		this.tenSP = ten;
		this.hinhAnh = hinh;
		this.giaCu = giaCu;
		this.giaMoi = giaMoi;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public double getGiaCu() {
		return giaCu;
	}

	public void setGiaCu(double giaCu) {
		this.giaCu = giaCu;
	}

	public double getGiaMoi() {
		return giaMoi;
	}

	public void setGiaMoi(double giaMoi) {
		this.giaMoi = giaMoi;
	}

}
