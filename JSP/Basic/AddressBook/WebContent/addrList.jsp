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
	
	<div id="container">
		<h2>주소 목록</h2>
		<hr />
		<p><a href="addForm.html">주소 추가</a></p>
		<table id="tbl2">
			<tr>
				<th>이름</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>성별</th>
			</tr>
			<%
				for(int i = 0; i < abDAO.getListAll().size(); i++){
					AddrBook addrBook = abDAO.getListAll().get(i);
			%>
			<tr>
				<td><%=addrBook.getUsername() %></td>
				<td><%=addrBook.getTel() %></td>
				<td><%=addrBook.getEmail() %></td>
				<td><%=addrBook.getSex() %></td>
			</tr>
			<%	
				}
			%>
		</table>
	</div>
</body>
</html>