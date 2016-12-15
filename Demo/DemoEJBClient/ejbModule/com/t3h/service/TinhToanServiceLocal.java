package com.t3h.service;

import javax.ejb.Local;

@Local
public interface TinhToanServiceLocal {
	int tinhTong(int a, int b);
}
