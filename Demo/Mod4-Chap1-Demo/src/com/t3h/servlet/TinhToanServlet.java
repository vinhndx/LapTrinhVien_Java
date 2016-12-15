package com.t3h.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.t3h.ejb.TinhToanService;

@WebServlet("/tinhtong")
public class TinhToanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private TinhToanService tinhToanService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int so1 = Integer.parseInt(request.getParameter("so1"));
		int so2 = Integer.parseInt(request.getParameter("so2"));
		
		int kq = tinhToanService.tinhTong(so1, so2);
		
		request.setAttribute("kq", kq);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
}
