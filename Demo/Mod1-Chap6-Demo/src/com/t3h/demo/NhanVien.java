package com.t3h.demo;

public class NhanVien {
	private String ten;
	private String tuoi;
	private double heSoLuong;
	
	public NhanVien() {
		
	}
	
	public void hamCOPhuongThucThayDoi(String ... s){
		for (String string : s) {
			System.out.println(string);
		}
	}
	
	public NhanVien(String ten) {
		this.ten = ten;
		System.out.println("Khoi tao NV");
	}

	public double tinhLuong(){
		return heSoLuong * 1000000;
	}
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double luong) {
		this.heSoLuong = luong;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTen();
	}

}
