package com.t3h.demo;



public class NhanVienVanPhong extends NhanVien{
	
	public NhanVienVanPhong() {
//		/super("NGuyen van c");
		System.out.println("Khoi tao NVVP");
	}
	
	private String phongBan;
	
	public String getPhongBan() {
		return phongBan;
	}
	
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	//	setTen("");
	}
	
	/*@Override
	public double tinhLuong() {
		return getHeSoLuong() * 1200000;
	}*/
}
