<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	<jsp:useBean id="member" class="com.bean.MemberBean" scope="request"/>
	
	<jsp:setProperty property="id" name="member" value="2021200"/>
	<jsp:setProperty property="name" name="member" value="안영이"/>
	<p>아이디 : <jsp:getProperty property="id" name="member"/></p>
	<p>이름 : <jsp:getProperty property="name" name="member"/></p>
</body>
</html>