<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//배열을 생성하고 출력하기
		int[] iArr = {1, 2, 3};
		out.println(Arrays.toString(iArr));
	%>

</body>
</html>