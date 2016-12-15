package com.t3h.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.t3h.beans.SanPham;
import com.t3h.service.SanPhamService;

@WebServlet("/singleproduct")
public class SingleProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SanPhamService sanPhamService = new SanPhamService();
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		SanPham sp = sanPhamService.laySanPhamTheoID(id);
		request.setAttribute("sp", sp);
		
		request.getRequestDispatcher("single-product.jsp").forward(request, response);
	}
}
