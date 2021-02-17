<%@page import="com.bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="login" class="com.bean.LoginBean" scope="request"/>
	<jsp:setProperty property="userid" name="login"/>
	<jsp:setProperty property="passwd" name="login"/>
	<%
		if(login.checkUser() == true)
			out.println("로그인 성공.");
		else
			out.println("로그인 실패.");
	%>
	<p>아이디 : <jsp:getProperty property="userid" name="login"/></p>
	<p>비밀번호 : <jsp:getProperty property="passwd" name="login"/></p>

</body>
</html>