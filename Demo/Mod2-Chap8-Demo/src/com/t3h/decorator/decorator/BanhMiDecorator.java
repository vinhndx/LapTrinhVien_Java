package com.t3h.decorator.decorator;

import com.t3h.decorator.bean.BanhMi;

public abstract class BanhMiDecorator implements BanhMi {
	
	protected BanhMi banhMi;
	
	public BanhMiDecorator(BanhMi banhMi) {
		this.banhMi = banhMi;
	}
	
	@Override
	public String xemThanhPhan() {
		return banhMi.xemThanhPhan();
	}
	
	@Override
	public double xemGia() {
		return banhMi.xemGia();
	}
}
