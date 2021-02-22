<%@page import="com.dao.AddrBook"%>
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
<link rel="stylesheet" type="text/css" href="css/address.css">
</head>
<body>
	<jsp:useBean id="abDAO" class="com.dao.AddrBookDAO" scope="application"/>
	<%
		String username = request.getParameter("username");
		//특정 주소 보기 메서드
		AddrBook addrBook = abDAO.getAbByUserName(username);
	%>
	<div id="container">
		<h2>상세 보기</h2>
		<hr />
		<table>
			<tr>
				<td>이름</td>
				<td><%=addrBook.getUsername() %></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%=addrBook.getTel() %></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><%=addrBook.getEmail() %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=addrBook.getSex() %></td>
			</tr>
		</table>
		<p><a href="addrList.jsp">목록 보기</a></p>
	</div>
</body>
</html>