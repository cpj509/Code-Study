<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.bean.MemberBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	<!-- useBean 태그를 사용하지 않고 클래스를 import해서 사용 -->
	<%
		MemberBean member = new MemberBean(); 
	%>	
	<p>아이디 : <%=member.getId() %></p>
	<p>이름 : <%=member.getName() %></p>
</body>
</html>