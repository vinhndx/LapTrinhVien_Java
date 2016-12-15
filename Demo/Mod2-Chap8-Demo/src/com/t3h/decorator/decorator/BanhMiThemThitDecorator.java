package com.t3h.decorator.decorator;

import com.t3h.decorator.bean.BanhMi;

public class BanhMiThemThitDecorator extends BanhMiDecorator {

	public BanhMiThemThitDecorator(BanhMi banhMi) {
		super(banhMi);
	}

	@Override
	public String xemThanhPhan() {
		return super.xemThanhPhan() + ", them thit";
	}
	
	@Override
	public double xemGia() {
		return super.xemGia() + 5000;
	}
}
