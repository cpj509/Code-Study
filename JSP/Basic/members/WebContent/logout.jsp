<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<%
	session.invalidate();	//세션 해제
	response.sendRedirect("main.jsp");	//메인 페이지로 이동
%>
<body>

</body>
</html>