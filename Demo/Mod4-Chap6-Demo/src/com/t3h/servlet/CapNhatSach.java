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

@WebServlet("/update")
public class CapNhatSach extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
    
	@EJB
	private BookServiceLocal bookServiceLocal;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		Book book = bookServiceLocal.getBookById(id);
		
		request.setAttribute("book", book);
		
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Book book = new Book();
		
		book.setId(Integer.parseInt(request.getParameter("id")));
		book.setTitle(request.getParameter("title"));
		book.setPrice(Float.parseFloat(request.getParameter("price")));
		book.setAuthor(request.getParameter("author"));
		
		bookServiceLocal.updateBook(book);
		
		response.sendRedirect("book");
	}
}
