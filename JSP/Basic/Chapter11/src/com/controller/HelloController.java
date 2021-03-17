package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloController
 */
//@WebServlet("/hello")
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//model - ������ ����
		String message = "Hello~ MVC!!";
		String[] name = {"���", "�̰�", "����"};
		//model - ���� model �̸� : msg, name
		request.setAttribute("msg", message);
		request.setAttribute("name", name);
		
		//view -> ������
		RequestDispatcher dispatcher = request.getRequestDispatcher("hello.jsp");
		dispatcher.forward(request, response);
		
	}

}
