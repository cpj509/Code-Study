<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성 처리</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		
		for(int i = 0; i < cookies.length; i++){
			cookies[i].setMaxAge(0);	//Delete cookie.
			
			response.addCookie(cookies[i]);
		}
		
		out.println("현재 설정 된 쿠키의 개수 -> " + cookies.length + "<br>");
		out.println("=============================================<br>");
		for(int i = 0; i < cookies.length; i++){
			out.println("쿠키의 속성 이름[" + i + "] " + cookies[i].getName() + " : <br>");
			out.println("쿠키의 속성 값[" + i + "] " + cookies[i].getValue() + "<br>");
			out.println("=============================================<br>");
		}
	%>

</body>
</html>