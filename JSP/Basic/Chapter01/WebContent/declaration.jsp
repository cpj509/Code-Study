<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언 태그 예제</title>
</head>
<body>
	<!-- 선언문 태그 -->
	<%!
		int num1 = 10;
		int num2 = 20;
		
		String str = "ABCD";
	%>
	
	<%
		out.println("합계 : " + (num1 + num2) + "<br>");
		out.println("str = " + str + "<br>");
	%>
		

</body>
</html>