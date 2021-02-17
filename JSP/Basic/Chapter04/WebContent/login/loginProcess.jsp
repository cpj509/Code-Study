<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//한글 인코딩 처리
		request.setCharacterEncoding("utf-8");
	
		//입력 상자의 데이터 가져오기
		String id = request.getParameter("userid");
		String pwd = request.getParameter("passwd");
		final String id2 = "admin";
		final String pwd2 = "0000";
		
		if(id.equals(id2) && pwd.equals(pwd2)){
			//out.println("로그인 성공.");
			response.sendRedirect("loginSuccess.jsp");
		}
		else{
			//out.println("로그인 실패.");
			response.sendRedirect("loginFail.jsp");
		}
	%>
	<p>아이디 : <%=id %></p>
	<p>비밀번호 : <%=pwd %></p>
</body>
</html>