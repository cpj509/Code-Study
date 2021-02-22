<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 세션</title>
</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID") != null){
			userID = (String)session.getAttribute("userID");
		}else{
			response.sendRedirect("session_out.jsp");	//세션 가져오기
		}
	%>
	<h3><%=session.getAttribute("userID") %>님 반갑습니다.</h3>
	<a href="session_out.jsp">로그 아웃</a>
</body>
</html>