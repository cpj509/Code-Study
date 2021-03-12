<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<%
	//자바 코드
	String sessionId = null;
	if(session.getAttribute("sessionId") != null){	//로그인이 되어있다면
		sessionId = (String)session.getAttribute("sessionId");
	}
%>
<body>
	<nav>
	<%if(sessionId == null){ %>
		<ul>
			<li><a href="main.jsp">Home</a></li>
			<li><a href="loginForm.jsp">로그인</a></li>
			<li><a href="memberForm.jsp">회원 가입</a></li>
			<li><a href="boardList.jsp">게시판</a></li>
		</ul>
	<%} else{ %>
		<ul>
			<li><a href="main.jsp">Home</a></li>
			<li><a href="logout.jsp">로그아웃</a></li>
			<li><a href="memberForm.jsp">회원 가입</a></li>
			<li><a href="boardList.jsp">게시판</a></li>
		</ul>
	<%} %>
	</nav>
</body>
</html>