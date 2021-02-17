<%@page import="com.bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- page import로 LoginBean 가져와서 구현 -->
	<%
		LoginBean login = new LoginBean();
		String uid = request.getParameter("userid");
		String pwd = request.getParameter("passwd");
		
		login.setUserid(uid);
		login.setPasswd(pwd);
		if(login.checkUser() == true)
			out.println("로그인 성공.");
		else
			out.println("로그인 실패.");
	%>
	<p>아이디 : <%=login.getUserid() %></p>
	<p>비밀번호 : <%=login.getPasswd() %></p>
	

</body>
</html>