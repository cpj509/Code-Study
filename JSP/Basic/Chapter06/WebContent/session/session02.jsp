<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 가져오기</title>
</head>
<body>
	<%
		String id = (String)session.getAttribute("userId");
		String pw = (String)session.getAttribute("userPw");
		
		out.println("설정 된 세션의 속성값[1]" + id + "<br>");
		out.println("설정 된 세션의 속성값[2]" + pw + "<br>");
	%>
</body>
</html>