<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 가져오기</title>
</head>
<body>
	<h3>== 세션을 모두 삭제 ==</h3>
	<%
		String id = (String)session.getAttribute("userId");
		String pw = (String)session.getAttribute("userPw");
		
		out.println("설정 된 세션의 속성값[1]" + id + "<br>");
		out.println("설정 된 세션의 속성값[2]" + pw + "<br>");
		
		session.invalidate();	//모든 세션 삭제
		
		response.sendRedirect("session02.jsp");
	%>
</body>
</html>