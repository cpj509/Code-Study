<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 양식</title>
<link rel="stylesheet" href="resources/css/style.css" />
<script type="text/javascript" src="resources/js/checkBoard.js"></script>
</head>
<%
	//자바 부분
	String sessionId = null;
	if(session.getAttribute("sessionId") != null){
		sessionId = (String)session.getAttribute("sessionId");
	} else{
		out.println("<script>alert('로그인이 필요합니다.');location.href = 'loginForm.jsp';</script>");
	}
%>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>글쓰기</h1>
		</div>
		<form name="writeForm" action="boardWriteProcess.jsp" method="post">
			<table id="table2">
				<tr>
					<td><input type="text" name="title" class="w_title" placeholder="글 제목" /></td>
				</tr>
				<tr>
					<td><textarea name="content" placeholder="글 내용"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="button" value="등록" onclick="checkBoard()"/>
						<input type="reset" value="취소" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>