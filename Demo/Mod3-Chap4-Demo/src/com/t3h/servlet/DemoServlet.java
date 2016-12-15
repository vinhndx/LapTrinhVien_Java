package com.t3h.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Goi ham service");
		super.service(request, response);
	}

	private ServletConfig config;


	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("doGet");
		
		String username = request.getServletContext().getInitParameter("username");
		String pass = config.getServletContext().getInitParameter("password");
		
		response.getWriter().println("Username: " + username);
		response.getWriter().println("Password: " + pass);
		
		response.getWriter().println("TESTREDIRECT: " + request.getAttribute("TESTREDIRECT"));
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("doPost");
	}

}
