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
		
		//ajax에서 보낸 id 받기
		String id = req.getParameter("id");
		
		//dao - 중복 메서드 호출
		MemberDAO memberDAO = new MemberDAO();
		boolean duplicatedID = memberDAO.duplicatedID(id);
		
		System.out.println(duplicatedID);
		//결과를 메시지로 전송
		if(duplicatedID == true) {	//아이디가 중복되었다면
			out.print("not_usable");
		}else {
			out.print("usable");
		}
	}
}