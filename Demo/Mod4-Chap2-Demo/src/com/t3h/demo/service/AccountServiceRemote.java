package com.t3h.demo.service;

import javax.ejb.Remote;

@Remote
public interface AccountServiceRemote {

	void rutTien(double soTien);
	void napTien(double soTien);
	double xemSoDu();
}
