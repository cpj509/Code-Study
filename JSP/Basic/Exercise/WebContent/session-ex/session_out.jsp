<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 세션</title>
</head>
<body>
	<%
		session.invalidate();	//모든 세션 삭제
		response.sendRedirect("session.jsp");
		//로그인 폼 페이지로 이동
	%>
</body>
</html>