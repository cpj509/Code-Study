package com.jweb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jweb.board.BoardDAO;
import com.jweb.member.Member;
import com.jweb.member.MemberDAO;

@WebServlet("*.do")	//do 확장자인 모든 파일에 매핑
public class MainController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MemberDAO memberDAO;
	BoardDAO boardDAO;
	
	@Override
	public void init() throws ServletException {	//초기화
		memberDAO = new MemberDAO();	//memberDAO 객체 생성
		boardDAO = new BoardDAO();	//boardDAO 객체 생성
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);	//ex) ?memberId = river(get방식)
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//utf-8 인코딩
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		//client의 요청 path 정보 추출
		String uri = req.getRequestURI();
		System.out.println(uri);
		String command = uri.substring(uri.lastIndexOf("/"));	//path
		System.out.println(command);
		String nextPage = null;
		
		if(command.equals("/memberForm.do")) {
			nextPage = "/memberForm.jsp";
		}else if(command.equals("/memberAdd.do")) {
			//폼 입력 자료 수집
			String memberId = req.getParameter("memberId");
			String passwd = req.getParameter("passwd");
			String name = req.getParameter("name");
			String gender = req.getParameter("gender");
			
			//Member 객체에 set()
			Member member = new Member();
			member.setMemberId(memberId);
			member.setPasswd(passwd);
			member.setName(name);
			member.setGender(gender);
			
			//dao - 회원 추가 처리
			memberDAO.addMember(member);
			
			//model(data)인 member 저장
			req.setAttribute("member", member);
			req.setAttribute("msg", "join");
			
			//view
			nextPage = "/memberResult.jsp";
		}else if(command.equals("/loginForm.do")) {
			nextPage = "/loginForm.jsp";
		}else if(command.equals("/loginProcess.do")) {
			//폼에 입력 된 자료 수집
			String id = req.getParameter("memberId");
			String pwd = req.getParameter("passwd");
			
			//dao - loginCheck() 호출
			int loginResult = memberDAO.login(id, pwd);
			if(loginResult == 1) {
				HttpSession session = req.getSession();
				session.setAttribute("sessionId", id);
				req.setAttribute("msg", "login");
			}
			
			//model and view
			req.setAttribute("loginResult", loginResult);
			
			nextPage = "/memberResult.jsp";
		}else if(command.equals("/logout.do")) {
			//세션 해제
			HttpSession session = req.getSession();
			session.invalidate();
			
			nextPage = "/main.jsp";
		}else if(command.equals("/memberView.do")) {
			//1명 회원 가져오기
			HttpSession session = req.getSession();
			String sessionId = (String)session.getAttribute("sessionId");
			
			//dao - getOneDB()
			Member member = memberDAO.getOneMember(sessionId);
			
			//model and view
			req.setAttribute("member", member);
			
			nextPage = "/memberView.jsp";
		}

		//포워딩 -> view로 보내기
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(nextPage);
		dispatcher.forward(req, resp);
	}

}