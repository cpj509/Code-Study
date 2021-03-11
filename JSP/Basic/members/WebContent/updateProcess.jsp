<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="member" class="com.jweb.Member"></jsp:useBean>
<jsp:setProperty property="*" name="member"/>
<%-- <jsp:setProperty property="passwd" name="member"/>
<jsp:setProperty property="name" name="member"/>
<jsp:setProperty property="gender" name="member"/>
<jsp:setProperty property="memberId" name="member"/> --%>
<jsp:useBean id="memDAO" class="com.jweb.MemberDAO" scope="application"></jsp:useBean>
<%
	memDAO.updateMember(member);
	out.println("<script>alert('회원 정보가 수정 되었습니다.');");
	//포워딩 방식
	out.println("location.href='memberList.jsp';</script>");	//JavaScript에서 사용하는 방식
	//response.sendRedirect("memberList.jsp");	//jsp에서 사용하는 방식
	//RequestDispatcher 클래스는 Servlet 등 여러 곳에서 사용.
%>
<body>

</body>
</html>