<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/address.css" />
</head>
<body>
<jsp:useBean id="addrBook" class="com.beans.AddrBook"></jsp:useBean>
<jsp:setProperty property="num" name="addrBook"/>
<jsp:setProperty property="username" name="addrBook"/>
<jsp:setProperty property="tel" name="addrBook"/>
<jsp:setProperty property="email" name="addrBook"/>
<jsp:setProperty property="gender" name="addrBook"/>
<jsp:setProperty property="joinDate" name="addrBook"/>

<jsp:useBean id="abDAO" class="com.beans.AddrBookDAO" scope="application"></jsp:useBean>
<%
	abDAO.addAddress(addrBook);
%>
	<div id="container">
		<h2><%=addrBook.getUsername() %>님이 등록되었습니다.</h2>
		<a href="addrList.jsp">목록 보기</a>
	</div>
</body>
</html>