package com.jweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jweb.board.Board;
import com.jweb.board.BoardDAO;
import com.jweb.member.Member;
import com.jweb.member.MemberDAO;

@WebServlet("*.do")	//do Ȯ������ ��� ���Ͽ� ����
public class MainController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MemberDAO memberDAO;
	BoardDAO boardDAO;
	
	@Override
	public void init() throws ServletException {	//�ʱ�ȭ
		memberDAO = new MemberDAO();	//memberDAO ��ü ����
		boardDAO = new BoardDAO();	//boardDAO ��ü ����
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);	//ex) ?memberId = river(get���)
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//utf-8 ���ڵ�
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		//client�� ��û path ���� ����
		String uri = req.getRequestURI();
		System.out.println(uri);
		String command = uri.substring(uri.lastIndexOf("/"));	//path
		System.out.println(command);
		String nextPage = null;
		
		if(command.equals("/memberForm.do")) {
			nextPage = "/memberForm.jsp";
		}else if(command.equals("/memberAdd.do")) {
			//�� �Է� �ڷ� ����
			String memberId = req.getParameter("memberId");
			String passwd = req.getParameter("passwd");
			String name = req.getParameter("name");
			String gender = req.getParameter("gender");
			
			//Member ��ü�� set()
			Member member = new Member();
			member.setMemberId(memberId);
			member.setPasswd(passwd);
			member.setName(name);
			member.setGender(gender);
			
			//dao - ȸ�� �߰� ó��
			memberDAO.addMember(member);
			
			//model(data)�� member ����
			req.setAttribute("member", member);
			req.setAttribute("msg", "join");
			
			//view
			nextPage = "/memberResult.jsp";
		}else if(command.equals("/loginForm.do")) {
			nextPage = "/loginForm.jsp";
		}else if(command.equals("/loginProcess.do")) {
			//���� �Է� �� �ڷ� ����
			String id = req.getParameter("memberId");
			String pwd = req.getParameter("passwd");
			
			//dao - loginCheck() ȣ��
			int loginResult = memberDAO.login(id, pwd);
			String name = memberDAO.getLoginNameById(id);
			
			if(loginResult == 1) {
				HttpSession session = req.getSession();
				session.setAttribute("sessionId", id);
				session.setAttribute("name", name);
				req.setAttribute("msg", "login");
			}
			
			//model and view
			req.setAttribute("loginResult", loginResult);
			
			nextPage = "/memberResult.jsp";
		}else if(command.equals("/logout.do")) {
			//���� ����
			HttpSession session = req.getSession();
			session.invalidate();
			
			nextPage = "/main.jsp";
		}else if(command.equals("/memberView.do")) {
			//1�� ȸ�� ��������
			HttpSession session = req.getSession();
			String sessionId = (String)session.getAttribute("sessionId");
			
			//dao - getOneDB()
			Member member = memberDAO.getOneMember(sessionId);
			
			//model and view
			req.setAttribute("member", member);
			
			nextPage = "/memberView.jsp";
		}else if(command.equals("/memberDelete.do")) {	//	210319 ����
			//���� ���ڿ� �ޱ�
			String memberId = req.getParameter("memberId");
			
			//dao - deleteMember() ȣ�� : ���� ó��
			memberDAO.deleteMember(memberId);
			
			//model and view
			req.setAttribute("msg", "delete");
			nextPage = "memberResult.jsp";
		}else if(command.equals("/memberUpdate.do")) {
			//���� ������ ����
			String memberId = req.getParameter("memberId");
			String passwd = req.getParameter("passwd");
			String name = req.getParameter("name");
			String gender = req.getParameter("gender");
			
			//member ��ü ���� - set()
			Member member = new Member();
			member.setMemberId(memberId);
			member.setPasswd(passwd);
			member.setName(name);
			member.setGender(gender);
			
			//dao - updateMember() 
			memberDAO.updateMember(member);
			
			//model and view
			req.setAttribute("member", member);
			req.setAttribute("msg", "update");
			nextPage = "/memberResult.jsp";
		}else if(command.equals("/boardList.do")) { //��� ��ȸ ��û
			//dao - getListAll() ȣ��
			ArrayList<Board> boardList = boardDAO.getListAll();
			
			//model and view
			req.setAttribute("boardList", boardList);
			nextPage = "/boardList.jsp";
		}else if(command.equals("/boardWriteForm.do")) {//�۾��� ��� ������ ��û
			nextPage ="/boardWriteForm.jsp";
		}else if(command.equals("/boardWriteAdd.do")) { //�۾��� ó�� ��û
			//�� �Է� �ڷ� ����
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			//���� Id - �α��ε� id
			HttpSession session = req.getSession();
			String sessionId = (String)session.getAttribute("sessionId");
			
			//Board ��ü�� set
			Board board = new Board();
			board.setTitle(title);
			board.setContent(content);
			board.setMemberId(sessionId);
			
			//dao - insertBoard()
			boardDAO.insertBoard(board);
			
			//model and view
			req.setAttribute("board", board);
			nextPage = "/boardList.do";  //��� ��� ó�� ��û
		}else if(command.equals("/boardView.do")) {
			// bnum �ޱ�
			int bnum = Integer.parseInt(req.getParameter("bnum"));
			
			boardDAO.updateHit(bnum);
			
			//dao - getOneDB()
			Board board = boardDAO.getOneBoard(bnum);
			
			//model and view
			req.setAttribute("board", board);
			nextPage = "/boardView.jsp";
		}else if(command.equals("/boardDelete.do")) {
			//bnum �ޱ�
			int bnum = Integer.parseInt(req.getParameter("bnum"));
			
			//dao - delete()
			boardDAO.deleteBoard(bnum);
			
			//model and view
			nextPage = "/boardList.do";
		}else if(command.equals("/boardUpdate.do")) {
			//���� �Է� �ڷ� ����
			int bnum = Integer.parseInt(req.getParameter("bnum"));
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			//board ��ü ����
			Board board = new Board();
			
			board.setTitle(title);
			board.setContent(content);
			board.setBnum(bnum);
			
			boardDAO.updateBoard(board);
			
			//model and view
			req.setAttribute("board", board);
			req.setAttribute("alert", "update");
			nextPage = "/boardList.do";
		}

		//������ -> view�� ������
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(nextPage);
		dispatcher.forward(req, resp);
	}

}