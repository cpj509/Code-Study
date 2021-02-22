<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소 추가</title>
</head>
<body>
	<jsp:useBean id="addrBook" class="com.dao.AddrBook"/>
	
	<jsp:useBean id="abDAO" class="com.dao.AddrBookDAO" scope="application"/>
	
	<%
		String username = request.getParameter("username");
		abDAO.removeAddress(username);
		response.sendRedirect("addrList.jsp");
	%>
</body>
</html>