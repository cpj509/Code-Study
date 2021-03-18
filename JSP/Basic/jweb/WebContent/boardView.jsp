<%@page import="com.jweb.board.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 양식</title>
<link rel="stylesheet" href="resources/css/style.css" />
<script type="text/javascript" src="resources/js/check.js"></script>
</head>
<jsp:useBean id="boardDAO" class="com.jweb.board.BoardDAO" scope="application"></jsp:useBean>
<%
	String sessionId = null;
	if(session.getAttribute("sessionId") != null){
		sessionId = (String)session.getAttribute("sessionId");
	}
	//자료 수집
	int bnum = 0;
	if(request.getParameter("bnum") != null){
		bnum = Integer.parseInt(request.getParameter("bnum"));
	}
	
	//조회수 1 증가
	boardDAO.updateHit(bnum);
	
	//dao - getOnBoard() 호출
	Board board = boardDAO.getOneBoard(bnum);
%>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>글 상세 보기</h1>
		</div>
		<table id="table3">
			<tr>
				<td>글 번호</td>
				<td><input type="text" name="bnum" value="<%=board.getBnum() %>" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td><input type="text" name="title" value="<%=board.getTitle() %>" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>글 작성자</td>
				<td><input type="text" name="memberId" value="<%=board.getMemberId() %>" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td><textarea type="text" name="content"  disabled="disabled"><%=board.getContent() %></textarea></td>
			</tr>
			<tr>
				<td>등록일</td>
				<td><input type="text" name="regDate" value="<%=board.getRegDate() %>" class="input" disabled="disabled"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<a href="boardList.jsp"><input type="button" value="목록" /></a>
					<%if(sessionId != null && sessionId.equals(board.getMemberId())) {%>
						<a href="boardUpdate.jsp?bnum=<%=board.getBnum() %>"><input type="button" value="수정"/></a>
						<a onclick="return confirm('정말 삭제하시겠습니까?')" href="boardDelete.jsp?bnum=<%=board.getBnum()%>"><input type="button" value="삭제"/></a>
					<%} %>
				</td>
			</tr>
		</table>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>