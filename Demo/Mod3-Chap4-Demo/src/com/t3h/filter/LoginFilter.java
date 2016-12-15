package com.t3h.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class LoginFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String username = (String) req.getSession().getAttribute("username");
		String requestURI = req.getRequestURI();
		
		if(username != null || requestURI.endsWith("login") || requestURI.endsWith("login.jsp")){
			
			chain.doFilter(request, response);
			
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, res);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
