package com.t3h.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Goi ham service");
		super.service(request, response);
	}

	private ServletConfig config;

	private ServletContext servletContext;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet init");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		this.servletContext = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet 22222222");
		
		request.getSession().setAttribute("username", "abc");
		
		String username = servletContext.getInitParameter("username");
		String pass = servletContext.getInitParameter("password");
		
		System.out.println("Username: " + username);
		System.out.println("Password: " + pass);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destroy");
	}
}
