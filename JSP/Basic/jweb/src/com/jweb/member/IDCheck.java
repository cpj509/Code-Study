package com.jweb.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/idcheck")
public class IDCheck extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		//ajax���� ���� id �ޱ�
		String id = req.getParameter("id");
		
		//dao - �ߺ� �޼��� ȣ��
		MemberDAO memberDAO = new MemberDAO();
		boolean duplicatedID = memberDAO.duplicatedID(id);
		
		System.out.println(duplicatedID);
		//����� �޽����� ����
		if(duplicatedID == true) {	//���̵� �ߺ��Ǿ��ٸ�
			out.print("not_usable");
		}else {
			out.print("usable");
		}
	}
}