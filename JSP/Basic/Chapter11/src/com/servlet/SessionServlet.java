package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/sess")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//���� �߱� - getSession()�� ȣ���Ͽ� ������ ������ ���� ����, ������ ���� ������ ���ҿ�
		HttpSession session = request.getSession();
		
		out.println("���� ���̵� : " + session.getId() + "<br>");
		out.println("���� ���� ���� �ð� : " + new Date(session.getCreationTime()) + "<br>");
		out.println("���� ��ȿ �ð� : " + session.getMaxInactiveInterval() + "<br>");
		if(session.isNew()) {
			out.println("�� ������ ����������ϴ�.");
		}
		
	}

}
