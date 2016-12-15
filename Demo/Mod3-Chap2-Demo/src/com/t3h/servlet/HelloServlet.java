package com.t3h.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String ten = request.getParameter("ten");
		response.getWriter().print("Hello: " + ten);
		
		int so1 = Integer.parseInt(request.getParameter("so1"));
		int so2 = Integer.parseInt(request.getParameter("so2"));
		
		response.getWriter().print("Tong la: " + (so1 + so2));
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int so1 = Integer.parseInt(request.getParameter("so1"));
		int so2 = Integer.parseInt(request.getParameter("so2"));
		
		response.getWriter().print("POST: Tong la: " + (so1 + so2));
	}

}
