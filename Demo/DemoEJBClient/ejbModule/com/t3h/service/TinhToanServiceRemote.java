package com.t3h.service;

import javax.ejb.Remote;

@Remote
public interface TinhToanServiceRemote {
	int tinhTong(int a, int b);
	int tinhHieu(int a, int b);
}
