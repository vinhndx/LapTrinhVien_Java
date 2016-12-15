package com.t3h.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/animal/*")
public class DemoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getServerName());
		response.getWriter().println(request.getServerPort());
		response.getWriter().println(request.getContextPath());
		response.getWriter().println(request.getServletPath());
		response.getWriter().println(request.getPathInfo());
		response.getWriter().println(request.getRequestURL());
		response.getWriter().println(request.getRequestURI());
		
		response.getWriter().println("Demo servlet");
	}
}
