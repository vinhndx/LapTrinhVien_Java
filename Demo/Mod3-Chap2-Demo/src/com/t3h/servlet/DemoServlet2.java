package com.t3h.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.ht")
public class DemoServlet2 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println("<html><head><title>TEST</title></head><body>");
		response.getWriter().println("<h1 style=\"color:red;\">HT FILE</h1>");
		response.getWriter().println("</body></html>");
		
	}
}
