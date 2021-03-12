<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="member" class="com.jweb.member.Member"></jsp:useBean>
<!-- Member member = new Member(); -->

<jsp:setProperty property="*" name="member"/>
<%-- <jsp:setProperty property="memberId" name="member"/>
<jsp:setProperty property="passwd" name="member"/>
<jsp:setProperty property="name" name="member"/>
<jsp:setProperty property="gender" name="member"/>
<jsp:setProperty property="joinDate" name="member"/> --%>


<jsp:useBean id="memDAO" class="com.jweb.member.MemberDAO"></jsp:useBean>
<!-- MemberDAO memDAO = new MemberDAO(); -->
<%
	memDAO.addMember(member);
	response.sendRedirect("memberList.jsp");
%>

<body>

</body>
</html>