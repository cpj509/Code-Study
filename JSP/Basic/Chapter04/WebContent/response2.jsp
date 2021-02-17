<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>이 페이지는 1초 마다 새로고침 됩니다.</p>
	<%
		response.setIntHeader("Refresh", 1);
	%>
	<%=Calendar.getInstance().getTime() %>

</body>
</html>