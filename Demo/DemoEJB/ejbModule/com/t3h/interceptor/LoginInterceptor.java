package com.t3h.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoginInterceptor {
	@AroundInvoke
	public Object kiemTraHamTinhTong(InvocationContext ic) throws Exception {
		String username = (String) ic.getParameters()[0];
		
		if(username != null && username.contains("@gmail.com")){
			return ic.proceed();
		} else {
			return "username phai la gmail";
		}
	}
}
