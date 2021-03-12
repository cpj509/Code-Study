<%@page import="com.jweb.member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<jsp:useBean id="memDAO" class="com.jweb.member.MemberDAO"></jsp:useBean>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>회원 목록</h1>
		</div>
		<table>
			<tr>
				<td>아이디</td>
				<td>이름</td>
				<td>성별</td>
				<td>가입일</td>
				<td>상세보기</td>
			</tr>
			<%
				for(Member member : memDAO.getListAll()){
			%>
			<tr>
				<td><%=member.getMemberId() %></td>
				<td><%=member.getName() %></td>
				<td><%=member.getGender() %></td>
				<td><%=member.getJoinDate() %></td>
				<td><a href="memberView.jsp?memberId=<%=member.getMemberId()%>"><input type="button" value="보기"/></a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>