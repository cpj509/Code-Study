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
		<div>
			<img src="resources/images/eclipse.jpeg" width="400" height="350" />
			<p><%
					Date day = new Date();
					int hour = day.getHours();
					int minute = day.getMinutes();
					int second = day.getSeconds();
					
					out.print("현재 시간 : " + hour + ":" + minute + ":" + second);
					
					response.setIntHeader("refresh", 1);
				%></p>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>