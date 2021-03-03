<%@page import="com.beans.AddrBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/address.css" />
</head>
<body>
<jsp:useBean id="abDAO" class="com.beans.AddrBookDAO" scope="application"></jsp:useBean>
	<div id="container">
		<h2>주소 목록</h2>
		<p><a href="addrForm.html">주소 추가</a></p>
		<table>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>가입일</td>
				<td>성별</td>
				<td>회원보기</td>
			</tr>
			<%
				for(int i = 0; i < abDAO.getListAll().size(); i++){
					AddrBook addrBook = abDAO.getListAll().get(i);
			%>
			<tr>
				<td><%=addrBook.getNum() %></td>
				<td><%=addrBook.getUsername() %></td>
				<td><%=addrBook.getGender() %></td>
				<td><%=addrBook.getJoinDate() %></td>
				<td><a href="addrView.jsp?num=<%=addrBook.getNum()%>">
				<input type="button" value="보기"/></a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>