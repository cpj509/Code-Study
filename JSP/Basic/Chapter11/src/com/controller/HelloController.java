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
		//model - 데이터 생성
		String message = "Hello~ MVC!!";
		String[] name = {"김산", "이강", "정들"};
		//model - 저장 model 이름 : msg, name
		request.setAttribute("msg", message);
		request.setAttribute("name", name);
		
		//view -> 보내줌
		RequestDispatcher dispatcher = request.getRequestDispatcher("hello.jsp");
		dispatcher.forward(request, response);
		
	}

}
