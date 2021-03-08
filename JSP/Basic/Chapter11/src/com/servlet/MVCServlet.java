package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCServlet
 */
@WebServlet("/mvc02")
public class MVCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Controller �κ�
		int num = 0;
		if(request.getParameter("num") != null){
			num = Integer.parseInt(request.getParameter("num"));
		}
		
		String result = null;
		if(num % 2 != 0){
			result = "Ȧ��";
		}else{
			result = "¦��";
		}
		
		//result�� ����
		request.setAttribute("result", result);
		
		//jsp�� �����͸� ����(������)
		RequestDispatcher dispatcher = request.getRequestDispatcher("mvc02.jsp");
		dispatcher.forward(request, response);
	}

}
