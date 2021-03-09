<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
<link rel="stylesheet" href="css/address.css" />
</head>
<body>
<jsp:useBean id="abDAO" class="com.beans.AddrBookDAO" scope="application"></jsp:useBean>
<%
	String email = request.getParameter("email");
	boolean result = abDAO.checkLogin(email);
	
	if(result){
		session.setAttribute("sessionId", email);	//권한 부여
	}else{
		out.println("<script>");
		out.println("alert('이메일이 일치하지 않습니다.')");
		out.println("history.go(-1)");	//로그인 페이지로 돌아감
		out.println("</script>");
	}
%>
</body>
	<div id="container">
		<!--  <h2><%=session.getAttribute("sessionId") %>으로 로그인 되었습니다.</h2> -->
		<h2><%=abDAO.returnName((String)session.getAttribute("sessionId")) %>으로 로그인 되었습니다.</h2>
		<a href="addrList.jsp">[목록 보기]</a>
	</div>
</html>