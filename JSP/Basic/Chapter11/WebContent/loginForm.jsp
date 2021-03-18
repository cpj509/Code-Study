<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
<style>
	#container{
		width: 100%;
		margin: 0 auto;
		text-align: center;
	}
	table{
		width: 400px;
		margin: 0 auto;
	}
	table, td{
		border: 1px solid #ccc;
		border-collapse: collapse;
		padding: 10px;
	}
	
</style>
</head>
<body>
	<div id="container">
		<h2>로그인</h2>
		<hr />
		<!-- <form action="member02_process.jsp" method="post"> -->
		<form action="login" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" maxlength="20" size="20"/></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="passwd" maxlength="20" size="20"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="가입" />
						<input type="reset" value="취소" />
					</td>
				</tr>
			</table>
		</form>
		<p><a href="http://localhost:8181/Chapter11/member01.jsp">회원 가입</a></p>
		<p><a href="<%=request.getContextPath() %>/member01.jsp">회원 가입</a></p>
		<h2><%=request.getContextPath() %></h2>
		<p><a href="${pagecontext.request.contextpath}/Chapter11/member01.jsp">회원 가입</a></p>
	</div>
</body>
</html>