<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mvc 예제(Model 1)</title>
</head>
<%
	//Controller 부분
	int num = 0;
	if(request.getParameter("num") != null){
		num = Integer.parseInt(request.getParameter("num"));
	}
	
	String result = null;
	if(num % 2 != 0){
		result = "홀수";
	}else{
		result = "짝수";
	}
%>
<body>
	<p><%=result %> 입니다.</p>
	<!-- 모델(Model) 데이터 -->
</body>
</html>