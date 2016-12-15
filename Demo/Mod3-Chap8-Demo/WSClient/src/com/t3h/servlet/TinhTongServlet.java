package com.t3h.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.t3h.com.TinhToanStub;
import com.t3h.com.TinhToanStub.TinhTong;
import com.t3h.com.TinhToanStub.TinhTongResponse;

public class TinhTongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int so1 = Integer.parseInt(request.getParameter("so1"));
		int so2 = Integer.parseInt(request.getParameter("so2"));
		
		TinhToanStub tinhToanStub = new TinhToanStub();
		TinhTong tinhTong = new TinhTong();
		tinhTong.setA(so1);
		tinhTong.setB(so2);
		
		TinhTongResponse tinhTongResponse = tinhToanStub.tinhTong(tinhTong);
		
		int kq = tinhTongResponse.get_return();
		
		request.setAttribute("kq", kq);
		
		request.getRequestDispatcher("tinhtong.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
