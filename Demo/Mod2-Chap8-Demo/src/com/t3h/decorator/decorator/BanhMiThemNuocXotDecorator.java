package com.t3h.decorator.decorator;

import com.t3h.decorator.bean.BanhMi;

public class BanhMiThemNuocXotDecorator extends BanhMiDecorator {

	public BanhMiThemNuocXotDecorator(BanhMi banhMi) {
		super(banhMi);
	}

	@Override
	public String xemThanhPhan() {
		return super.xemThanhPhan() + ", them nuoc xot";
	}
	
	@Override
	public double xemGia() {
		return super.xemGia() + 2000;
	}
}
