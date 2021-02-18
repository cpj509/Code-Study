<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>구구단 출력하기</h4>
	<jsp:useBean id="gugu" class="ch04.com.dao.GuGuDan"></jsp:useBean>
		
	<%
	int result[] = gugu.process(5);
	
	for(int i = 0; i < 9; i++)
		out.print(5 + " * " + (i + 1) + " = " + result[i] + "<br>");
	%>

</body>
</html>