package com.t3h.decorator.bean;

public class BanhMiNgot implements BanhMi {

	@Override
	public String xemThanhPhan() {
		return "Banh mi ngot ";
	}

	@Override
	public double xemGia() {
		return 5000;
	}

}
