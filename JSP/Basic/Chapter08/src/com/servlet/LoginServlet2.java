package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		//웹 브라우저로 html 형식으로 응답(전송)
		
		//출력 클래스 사용
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("userid");
		String pwd = request.getParameter("passwd");
		String phone = request.getParameter("phone");
		
		String data = "<html><body>";
		
		data += "<p>아이디 : " + id;
		data += "<p>비밀번호 : " + pwd;
		data += "<p>전화번호 : " + phone;
		data += "</body></html>";
		
		out.println(data);
	}
}