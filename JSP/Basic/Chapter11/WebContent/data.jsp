<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 예제</title>
</head>
<%
	pageContext.setAttribute("fruit", "사과");
%>
<body>
	<h2>${lotto[0]}, ${lotto[1]}, ${lotto[2]}, ${lotto[3]}, ${lotto[4]}, ${lotto[5]}</h2>
	<h1>${empty param.num ? '값이 비어 있습니다' : param.num}</h1>
	<h3>차 이름 : ${car.brand}</h3>
	<h3>CC : ${car.cc}</h3>
	<h4>과일 : ${fruit}</h4>
	<h5>${header.accept}</h5>
</body>
</html>