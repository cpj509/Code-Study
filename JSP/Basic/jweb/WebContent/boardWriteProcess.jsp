<%@page import="com.jweb.board.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<jsp:useBean id="boardDAO" class="com.jweb.board.BoardDAO" scope="application"></jsp:useBean>
<%
	//session 가져오기
	String sessionId = (String)session.getAttribute("sessionId");
	//자료 수집
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	//set()
	Board board = new Board();
	board.setTitle(title);
	board.setContent(content);
	board.setMemberId(sessionId);
	//게시글 추가 메서드 호출
	boardDAO.insertBoard(board);
	response.sendRedirect("boardList.jsp");
%>
</body>
<%=board.getTitle() + ", " + board.getContent() + ", " + board.getMemberId()%>
</html>