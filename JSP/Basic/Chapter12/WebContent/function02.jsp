<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>functions 태그</title>
</head>
<body>
	<p>Hello, Java Server Page! -> </p>
		<c:set var="text" value="${fn:split('Hello, Java Server Page!', ' ') }"></c:set>
	<p>text[0] = ${text[0] }</p>
	<p>text[1] = ${text[1] }</p>
	<p>문자열 개수 : ${fn:length(text) }</p>
	
	<!-- 문자열(배열) 전체 출력 -->
	<p>
		<c:forEach var="i" begin="0" end="${fn:length(text) - 1}" >
		text[${i }] = ${text[i] }<br>		
		</c:forEach>
	</p>
	
	<p>문자열 연결 - 구분 기호(문자)로 연결</p>
	<p>${fn:join(text, '-') }</p>
</body>
</html>