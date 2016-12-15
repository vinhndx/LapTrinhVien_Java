package com.t3h.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TinhToanInterceptor {

	@AroundInvoke
	public Object kiemTraHamTinhTong(InvocationContext ic) throws Exception {
		int a = (Integer) ic.getParameters()[0];
		int b = (Integer) ic.getParameters()[1];

		if (a % 2 == 0 && b % 2 == 0) {
			throw new Exception();
		} else {
			return ic.proceed();
		}
	}
	
	@AroundInvoke
	public Object tinhThoiGianThucThi(InvocationContext ic) throws Exception {
		long start = System.currentTimeMillis();
		Object theReturn = ic.proceed();
		long end = System.currentTimeMillis();
		
		long time = end - start;
		System.out.println("Phuong thuc " + ic.getMethod().getName() + " duoc thuc thi trong " + time + " ms");
		
		return theReturn;
	}
}
