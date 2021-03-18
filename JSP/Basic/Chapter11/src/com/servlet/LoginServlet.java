package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//html�� ǥ��
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//�� �Է� �ڷ� ����
		String id = request.getParameter("id");
		String pwd = request.getParameter("passwd");
		
		//���� �߱�
		HttpSession session = request.getSession();
		if(id.equals("korea") && pwd.equals("2021")) {
			session.setAttribute("uderId", id);
			
			out.println(id + "�� ȯ���մϴ�.");
		}else {
			out.println("<script>alert('���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.'); history.go(-1);</script>");
		}
	}

}
