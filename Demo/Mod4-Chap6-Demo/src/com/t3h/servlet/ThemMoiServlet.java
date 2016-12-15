package com.t3h.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.t3h.entities.Book;
import com.t3h.service.BookServiceLocal;

@WebServlet("/themmoi")
public class ThemMoiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private BookServiceLocal bookServiceLocal;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Book book = new Book();
		book.setTitle(request.getParameter("title"));
		book.setPrice(Float.parseFloat(request.getParameter("price")));
		book.setAuthor(request.getParameter("author"));
		
		bookServiceLocal.inserBook(book);
		
		response.sendRedirect("book");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
