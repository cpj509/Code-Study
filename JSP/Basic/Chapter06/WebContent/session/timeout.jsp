<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 유효 시간 설정</title>
</head>
<body>
	<h3>== 세션 유효시간 변경 전 ==</h3>
	<%
		int time = session.getMaxInactiveInterval() / 60;
		
		out.println(session.getMaxInactiveInterval() + "초<br>");
		out.println(time + "분<br>");
	%>
	
	<h3>== 세션 유효시간 변경 후 ==</h3>
	<%
		session.setMaxInactiveInterval(10 * 60);
		time = session.getMaxInactiveInterval() / 60;
		out.println(session.getMaxInactiveInterval() + "초<br>");
		out.println(time + "분<br>");
	%>
</body>
</html>