<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="memDAO" class="com.jweb.member.MemberDAO" scope="application"></jsp:useBean>
<%
	String memId = request.getParameter("memberId");
	memDAO.deleteMember(memId);
	response.sendRedirect("memberList.jsp");	//목록 페이지로 이동
%>
<body>
	
</body>
</html>