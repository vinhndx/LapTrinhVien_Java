package com.t3h.decorator.decorator;

import com.t3h.decorator.bean.BanhMi;

public class BanhMiKhuyenMaiDecorator extends BanhMiDecorator {

	public BanhMiKhuyenMaiDecorator(BanhMi banhMi) {
		super(banhMi);
	}

	@Override
	public String xemThanhPhan() {
		return super.xemThanhPhan();
	}
	
	@Override
	public double xemGia() {
		return super.xemGia() * .7;
	}
}
