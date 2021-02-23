<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="session_process.jsp" method="post">
		<p>
			<label for="id">아이디 : </label>
			<input type="text" name="userid" />
		</p>
		<p>
			<label for="passwd">비밀번호 : </label>
			<input type="text" name="passwd" />
		</p>
		<p><input type="submit" value="전송" /></p>
	</form>
</body>
</html>