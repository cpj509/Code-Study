<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
</head>
<jsp:useBean id="boardDAO" class="com.jweb.board.BoardDAO" scope="application"></jsp:useBean>
<jsp:useBean id="board" class="com.jweb.board.Board"></jsp:useBean>
<jsp:setProperty property="title" name="board"/>
<jsp:setProperty property="content" name="board"/>
<jsp:setProperty property="bnum" name="board"/>
<% 
	boardDAO.updateBoard(board);
	out.println("<script>alert('글이 수정되었습니다.'); location.href='boardList.jsp';</script>");
	
%>
<body>

</body>
</html>