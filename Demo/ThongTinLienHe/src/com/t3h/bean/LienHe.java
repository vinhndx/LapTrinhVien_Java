package com.t3h.bean;

public class LienHe {
	private String ten;
	private String sdt;
	private String hinhAnh;

	public LienHe() {
		// TODO Auto-generated constructor stub
	}
	
	public LienHe(String ten, String sdt, String hinhAnh) {
		super();
		this.ten = ten;
		this.sdt = sdt;
		this.hinhAnh = hinhAnh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

}
