<%@page import="com.beans.AddrBook"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/address.css">
</head>
<body>
<jsp:useBean id="abDAO" class="com.beans.AddrBookDAO" scope="application"></jsp:useBean>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	AddrBook addrBook = abDAO.getOneDB(num);
%>
	<div id="container">
		<h2>상세 보기</h2>
		<hr />
		<table>
			<tr>
				<td>번호</td>
				<td><input type="text" name="num" maxlength="20" size="20" value="<%=addrBook.getNum() %>" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="username" maxlength="20" size="20" value="<%=addrBook.getUsername() %>" /></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="tel" name="tel" maxlength="20" size="20" value="<%=addrBook.getTel() %>"/></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="email" maxlength="20" size="20" value="<%=addrBook.getEmail() %>"/></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<!--  <input type="text" name="gender" value="<%=addrBook.getGender() %>" /> -->
					
					<%
						if(addrBook.getGender().equals("남")){
					%>
					<input type="radio" name="gender" value="남" checked="checked"/>남
					<input type="radio" name="gender" value="여" />여
					<%}else {%>
					<input type="radio" name="gender" value="남" />남
					<input type="radio" name="gender" value="여" checked="checked"/>여
					<%} %>
				</td>
			</tr>
			<tr>
				<td>가입일</td>
				<td><input type="text" name="joinDate" maxlength="20" size="20" value="<%=addrBook.getJoinDate() %>"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<a href="addrList.jsp"><input type="button" value="목록"/></a>
					<a href="addrDelete.jsp?num=<%= addrBook.getNum() %>"
					onclick="return confirm('정말로 삭제 하시겠습니까?')">
					<input type="button" value="삭제"/></a>
				</td>
			</tr>
			
		</table>
	</div>
</body>
</html>