<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to our-site</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="container">
		<div class="title">
			<h1>Welcome to World Job Friends</h1>
		</div>
		<form name="regForm" action="memberAdd.jsp" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="memberId" placeholder="id" /></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="passwd" placeholder="password"/></td>
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="passwd_confirm" placeholder="password confirm"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" required="required"/></td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<input type="radio" name="gender" value="남"/>남
						<input type="radio" name="gender" value="여"/>여
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="등록" />
						<input type="reset" value="취소" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>