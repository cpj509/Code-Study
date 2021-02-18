<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>선택한 과일</h2>
	<%
		request.setCharacterEncoding("utf-8");
	
		String[] fruits = request.getParameterValues("fruit");
	%>
	
	<p>
	<%
	for(int i = 0; i < fruits.length; i++){
		out.println(fruits[i]);
	}
	%>
	</p>
	

</body>
</html>