package com.t3h.decorator.bean;

public class BanhMiKhong implements BanhMi{

	@Override
	public String xemThanhPhan() {
		return "Banh mi khong";
	}

	@Override
	public double xemGia() {
		return 3000;
	}

}
