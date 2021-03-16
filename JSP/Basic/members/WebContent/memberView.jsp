<%@page import="com.jweb.member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 보기</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<jsp:useBean id="memDAO" class="com.jweb.member.MemberDAO" scope="application"></jsp:useBean>
<%
	String sessionId = null;
	if(session.getAttribute("sessionId") != null){
		sessionId = (String)session.getAttribute("sessionId");
	}


	String memId = request.getParameter("memberId");
	Member member = memDAO.getOneMember(memId);
%>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>상세 보기</h1>
		</div>
	</div>
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="memberId" value="<%=member.getMemberId() %>" disabled="disabled"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="passwd" value="<%=member.getPasswd() %>" disabled="disabled"/></td>
		</tr>
		<tr>
			<td>비밀번호 확인</td>
			<td><input type="text" name="passwd_confirm" value="<%=member.getPasswd() %>" disabled="disabled"/></td>
		</tr>
		<tr>
			<td>이 름</td>
			<td><input type="text" name="name" value="<%=member.getName() %>" disabled="disabled"/></td>
		</tr>
		<tr>
			<td>성 별</td>
			<td>
				<%if(member.getGender() == null){ %>
				<input type="radio" name="gender" value="남" disabled="disabled"/>남
				<input type="radio" name="gender" value="여" disabled="disabled"/>여
				<%} else{%>
				<%if(member.getGender().equals("남")) {%>
				<input type="radio" name="gender" value="남" checked="checked" disabled="disabled"/>남
				<input type="radio" name="gender" value="여" disabled="disabled"/>여
				<%} else {%>
				<input type="radio" name="gender" value="남" disabled="disabled"/>남
				<input type="radio" name="gender" value="여" checked="checked" disabled="disabled"/>여
				<%} 
				}%>		
			</td>
		</tr>
		<tr>
			<td>가입일</td>
			<td><input type="text" name="memberId" value="<%=member.getJoinDate() %>" disabled="disabled"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="memberList.jsp"><input type="button" value="목록" /></a>
				<a href="memberUpdate.jsp?memberId=<%=member.getMemberId()%>"><input type="button" value="수정"/></a>
				<a onclick="return confirm('정말로 탈퇴하시겠습니까?')" href="memberDelete.jsp?memberId=<%=member.getMemberId()%>"><input type="button" value="탈퇴"/></a>
			</td>
		</tr>
	</table>
</body>
</html>