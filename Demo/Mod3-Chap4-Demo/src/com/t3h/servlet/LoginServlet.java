package com.t3h.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if("abc".equals(username) && "123".equals(password)){
			request.getSession().removeAttribute("error");
			request.getSession().setAttribute("username", username);
			response.sendRedirect("index.jsp");
		} else {
			request.getSession().setAttribute("error", "Dang nhap that bai");
			response.sendRedirect("login.jsp");
		}
	}
}
