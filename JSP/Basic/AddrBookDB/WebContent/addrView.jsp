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
	
	String sessionId = null;
	if(session.getAttribute("sessionId") != null){	//로그인이 된 상태라면
		sessionId = (String)session.getAttribute("sessionId");	//세션을 가져옴
	}
%>
	<div id="container">
		<h2>상세 보기</h2>
		<hr />
		<table>
			<tr>
				<td>번호</td>
				<td><input type="text" name="num" maxlength="20" size="20" value="<%=addrBook.getNum() %>" readonly="readonly"/></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="username" maxlength="20" size="20" value="<%=addrBook.getUsername() %>" readonly="readonly"/></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="tel" name="tel" maxlength="20" size="20" value="<%=addrBook.getTel() %>" readonly="readonly"/></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="email" maxlength="20" size="20" value="<%=addrBook.getEmail() %>" readonly="readonly"/></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<!--  <input type="text" name="gender" value="<%=addrBook.getGender() %>" /> -->
					
					<%
						if(addrBook.getGender().equals("남")){
					%>
					<input type="radio" name="gender" value="남" checked="checked" onclick="return(false);"/>남
					<input type="radio" name="gender" value="여" onclick="return(false);"/>여
					<%}else {%>
					<input type="radio" name="gender" value="남" onclick="return(false);"/>남
					<input type="radio" name="gender" value="여" checked="checked" onclick="return(false);"/>여
					<%} %>
				</td>
			</tr>
			<tr>
				<td>가입일</td>
				<td><input type="text" name="joinDate" maxlength="20" size="20" value="<%=addrBook.getJoinDate() %>" readonly="readonly"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<a href="addrList.jsp"><input type="button" value="목록"/></a>
					<!-- if문을 사용해서 sessionId와 email이 같으면 -->
					<% 
						if(sessionId != null && sessionId.equals(addrBook.getEmail())) {	//&& 앞에는 로그인 체크.
					%>
						<a href="addrUpdate.jsp?num=<%=addrBook.getNum()%>"><input type="button" value="수정"/></a>
						<a href="addrDelete.jsp?num=<%=addrBook.getNum() %>" 
							onclick="return confirm('정말로 삭제 하시겠습니까?')">
							<input type="button" value="삭제"/></a>
					<%} %>
				</td>
			</tr>
			
		</table>
	</div>
</body>
</html>