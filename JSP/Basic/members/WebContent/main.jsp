<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to our-site</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>Welcome to World Job Friends</h1>
		</div>
		<div class="mainimg">
			<img src="resources/images/friends.png" />
			<p><%
					Date day = new Date();
					int hour = day.getHours();
					int minute = day.getMinutes();
					//int second = day.getSeconds();
					
					//out.print("현재 시간 : " + hour + ":" + minute + ":" + second);
					out.print("현재 시간 : " + hour + "시 " + minute + "분");
					
					response.setIntHeader("refresh", 60);
				%></p>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>