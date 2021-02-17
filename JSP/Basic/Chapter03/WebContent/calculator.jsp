<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	<h2>세 제곱 계산하기</h2>
	<jsp:useBean id="calc" class="com.bean.CalcBean"/>
	<!-- calc는 new CalcBean()의 인스턴스와 같다. -->
	<%
		int num = calc.calculate(2);
	%>
	<p><%="2의 3제곱 " +  num%></p>
</body>
</html>