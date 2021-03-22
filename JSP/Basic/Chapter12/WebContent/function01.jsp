<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>functions 태그</title>
</head>
<body>
	<p>문자열 검색</p>
	<p>Hello, Java Server Page -> ${fn:contains("Hello, Java Server Page", "Java") }</p>
	<!-- contains()는 대소문자 구별. containsIgnoreCase()는 구별하지 않음. -->
	<p>Hello, Java Server Page -> ${fn:containsIgnoreCase("Hello, Java Server Page", "java") }</p>
</body>
</html>