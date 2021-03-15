<%@page import="com.jweb.board.Board"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<jsp:useBean id="boardDAO" class="com.jweb.board.BoardDAO" scope="application"></jsp:useBean>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>게시판 목록</h1>
		</div>
		<table>
			<tr class="thead">
				<td>번호</td>
				<td>글제목</td>
				<td>작성자</td>
				<td>등록일</td>
			</tr>
			<%
				//반복문 사용 출력
				for(Board board : boardDAO.getListAll()){
			%>
			<tr>
				<td><%=board.getBnum() %></td>
				<td><a href="boardView.jsp?bnum=<%=board.getBnum() %>"><%=board.getTitle() %></a></td>
				<td><%=board.getMemberId() %></td>
				<td><%=board.getRegDate() %></td>
			</tr>
			<%} %>
			<tr>
				<td colspan="4">
					<a href="boardWriteForm.jsp"><input type="submit" value="글쓰기" /></a>
				</td>
			</tr>
		</table>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>