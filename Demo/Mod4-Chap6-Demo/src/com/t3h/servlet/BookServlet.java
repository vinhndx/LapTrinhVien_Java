package com.t3h.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.t3h.entities.Book;
import com.t3h.service.BookServiceLocal;
import com.t3h.util.EbookShopConstant;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private BookServiceLocal bookServiceLocal;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page = 1;
		
		String pageStr = request.getParameter("page");
		
		try {
			page = Integer.parseInt(pageStr);
		} catch (Exception e) {
			page = 1;
		}
		
		if(page < 1){
			page = 1;
		}
		
		Long total = bookServiceLocal.getTotalBook();
		
		List<Book> books = bookServiceLocal.getBooksPaging(page);
		
		request.setAttribute("books", books);
		request.setAttribute("page", page);
		request.setAttribute("total", total);
		request.setAttribute("totalPage", total / EbookShopConstant.PAGING_SIZE + (total % EbookShopConstant.PAGING_SIZE == 0 ? 0 : 1) );
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
		/*for (Book book : books) {
			response.getWriter().println(book.getTitle() + " - " + book.getAuthor());
		}*/
		
		/*List<Book> books2 = bookServiceLocal.getAllBooksByAuthor(request.getParameter("author"));
		
		response.getWriter().println("<hr>");
		
		for (Book book : books2) {
			response.getWriter().println(book.getTitle() + " - " + book.getAuthor());
		}*/
		
	}
}
