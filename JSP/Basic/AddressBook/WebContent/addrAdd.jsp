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
	<jsp:setProperty property="username" name="addrBook"/>
	<jsp:setProperty property="tel" name="addrBook"/>
	<jsp:setProperty property="email" name="addrBook"/>
	<jsp:setProperty property="sex" name="addrBook"/>
	
	<jsp:useBean id="abDAO" class="com.dao.AddrBookDAO" scope="application"/>
	
	<%
		abDAO.addAddress(addrBook);
	%>

	<div id="container">
		<h2>등록 내용</h2>
		<hr />
		<p>이름 : <%=addrBook.getUsername() %></p>
		<p>전화번호 : <%=addrBook.getTel() %></p>
		<p>이메일 : <%=addrBook.getEmail() %></p>
		<p>성별 : <%=addrBook.getSex() %></p>
		<hr />
		<p><a href="addrList.jsp">목록 보기</a></p>
	</div>
</body>
</html>