<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String username = request.getParameter("username");
	session.setAttribute("userName", username);	//세션 부여
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#container{
		width: 80%;
		margin: 0 auto;
		text-align: center;
	}
</style>
</head>
<body>
	<div id="container">
		<h2>상품 선택</h2>
		<hr />
		<p><%=session.getAttribute("userName") %>님 환영합니다.</p>
		<form action="productAdd.jsp" method="get">
			<select name="product">
				<option selected>사과</option>
				<option>귤</option>
				<option>토마토</option>
				<option>키위</option>
			</select>
			<input type="submit" value="추가" />
		</form>
		<p><input type="button" value="계산하기" onclick="location.href='checkOut.jsp'" /></p>
	</div>
</body>
</html>