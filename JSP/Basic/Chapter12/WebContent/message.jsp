<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다국어 처리</title>
</head>
<body>
	<p>-- 기본 로케일(Locale) --</p>
		<fmt:setLocale value="ko"/>
		<fmt:setBundle basename="com.bundle.message"/>
	<p>제 목 : <fmt:message key="title"/></p>
	<p>이 름 : <fmt:message key="username" /></p>
	
	<p>-- 영문 로케일(Locale) --</p>
		<fmt:setLocale value="en"/>
		<fmt:setBundle basename="com.bundle.message_en"/>
	<p>Title : <fmt:message key="title"/></p>
	<p>Name : <fmt:message key="username" /></p>

</body>
</html>