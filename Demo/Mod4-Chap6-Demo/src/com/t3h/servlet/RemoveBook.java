package com.t3h.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.t3h.service.BookServiceLocal;

@WebServlet("/remove")
public class RemoveBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private BookServiceLocal bookServiceLocal;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		bookServiceLocal.removeBookById(id);
		
		response.sendRedirect("book");
	}

}
