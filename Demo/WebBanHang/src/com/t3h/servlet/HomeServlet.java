package com.t3h.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.t3h.beans.SanPham;
import com.t3h.service.SanPhamService;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	private SanPhamService sanPhamService = new SanPhamService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<SanPham> dsSanPham = sanPhamService.layDanhSachSanPhamMoiNhat(6);
		
		request.setAttribute("dsSanPham", dsSanPham);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
