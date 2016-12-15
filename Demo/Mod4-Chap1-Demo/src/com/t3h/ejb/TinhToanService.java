package com.t3h.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class TinhToanService {
	public int tinhTong(int a, int b) {
		return a + b;
	}
}
