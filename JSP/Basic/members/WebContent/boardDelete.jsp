<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<!-- page, request, session, application -->
<jsp:useBean id="boardDAO" class="com.jweb.board.BoardDAO" scope="application"></jsp:useBean>
<%
	//자료 수집
	int bnum = Integer.parseInt(request.getParameter("bnum"));

	//dao - delete
	boardDAO.deleteBoard(bnum);
	response.sendRedirect("memberResult.jsp?");
	
%>
<body>

</body>
</html>