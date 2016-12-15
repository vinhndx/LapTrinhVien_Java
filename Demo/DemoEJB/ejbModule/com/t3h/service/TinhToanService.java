package com.t3h.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import com.t3h.interceptor.TinhToanInterceptor;

@Stateless
@LocalBean
@Interceptors(TinhToanInterceptor.class)
public class TinhToanService implements TinhToanServiceRemote, TinhToanServiceLocal {

	@Override
	public int tinhTong(int a, int b) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a + b;
	}

	@Override
	public int tinhHieu(int a, int b) {
		return a - b;
	}

}
