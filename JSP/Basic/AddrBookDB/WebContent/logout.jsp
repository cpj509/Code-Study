<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그 아웃</title>
</head>
<body>
<%
	session.invalidate();	//모든 세션을 해제
	response.sendRedirect("addrForm.html");
%>
</body>
</html>