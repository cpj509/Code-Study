<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>삭제 처리</title>
</head>
<body>
<jsp:useBean id="abDAO" class="com.beans.AddrBookDAO" scope="application"></jsp:useBean>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	abDAO.removeAddress(num);
%>
	<h2>삭제 되었습니다.</h2>
	<a href="addrList.jsp">목록으로 돌아가기</a>
</body>
</html>