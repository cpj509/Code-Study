<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현문 태그 예제</title>
</head>
<body>
	<p>오늘의 날짜 : <%= new java.util.Date() %></p>
	
	<%
		Date date = new Date();
		out.println("오늘의 날짜 : " + date + "<br>");
	%>
	
	<%="오늘의 날짜 : " + date %>

</body>
</html>