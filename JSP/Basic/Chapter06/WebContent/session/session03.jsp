<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 가져오기</title>
</head>
<body>
	<h3>== 세션을 삭제 하기 전 ==</h3>
	<%
		String id = (String)session.getAttribute("userId");
		String pw = (String)session.getAttribute("userPw");
		
		out.println("설정 된 세션의 속성값[1]" + id + "<br>");
		out.println("설정 된 세션의 속성값[2]" + pw + "<br>");
		
		session.removeAttribute("userId");	//특정 세션 삭제
	%>
	<h3>== 세션을 삭제 한 후 ==</h3>
	<%
		id = (String)session.getAttribute("userId");
		pw = (String)session.getAttribute("userPw");
		
		out.println("설정 된 세션의 속성값[1]" + id + "<br>");
		out.println("설정 된 세션의 속성값[2]" + pw + "<br>");
	%>
</body>
</html>